package productController;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;


/**
 * Servlet implementation class ProductEditController
 */
@WebServlet("/ProductEditController")
public class ProductEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		ProductService ProductService = new ProductServiceImpl();
		Product p = new Product();
		//image ��Ƽ��Ʈ: request, ����������,�뷮, ���ڵ�, �ߺ�����
				String img=null;
				int maxSize=1024*1024*10;
//				String uploadPath="C:\\BackendToyProject\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\album_img\\";
				String uploadPath=request.getSession().getServletContext().getRealPath("/album_img");
				
				
				File upDir=new File(uploadPath);
				if(!upDir.exists()) {
					upDir.mkdir();
				}
				System.out.println("minsert - upDir"+upDir);
				try {
					// MultipartRequest���� :request,����������,�뷮,���ڵ�Ÿ��,�ߺ����ϸ� ���� �⺻ ��å
					MultipartRequest multi = new MultipartRequest(request, uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
					p.setP_title(multi.getParameter("p_title"));
					p.setP_producer(multi.getParameter("p_producer"));
					p.setP_text(multi.getParameter("p_text"));
					p.setP_img(multi.getParameter("p_img"));
//					String newUploadPath="C:\\BackendToyProject\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\album_img\\";
					String newUploadPath=request.getSession().getServletContext().getRealPath("/album_img/");

					Enumeration files = multi.getFileNames();
					while(files.hasMoreElements()) {
							String file01=(String)files.nextElement();
							img= multi.getFilesystemName(file01);
							File file= multi.getFile(file01);
							if(img!=null) {
								Product p1= ProductService.findProduct(p.getP_title());
								String arr[]=p1.getP_img().split("/");
								String fname=arr[arr.length-1];//�迭�� 0���� ����
								File f= new File(newUploadPath+fname);
								//System.out.println(f);
								f.delete();
							}
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				if(img!=null) {
				p.setP_img("/album_img/"+img);
				}
				ProductService.editProduct(p);
		String path="/servlet_music/ProductListController";
		response.sendRedirect(path);
	}

}
