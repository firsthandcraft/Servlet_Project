package productController;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Member;
import model.Product;
import service.MemberService;
import service.MemberServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

/**
 * Servlet implementation class ProductInsertController
 */
@WebServlet("/ProductInsertController")
public class ProductInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertController() {
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
		MemberService MemberService=new MemberServiceImpl();
		HttpSession session = request.getSession(false);//HttpSession�� �����ϸ� ���� HttpSession�� ��ȯ�ϰ� �������� ������ ������ �������� �ʰ� �׳� null�� ��ȯ�մϴ�
		String p_email=(String)session.getAttribute("email");
		Product p = new Product();
		p.setP_email(p_email);
		Member m =MemberService.findMember(p_email);
		boolean flag =false;
		String seller=m.getMembershipPlan();
		p.setP_seller(seller);
		System.out.println("seller"+seller);
		
		//image ��Ƽ��Ʈ: request, ����������,�뷮, ���ڵ�, �ߺ�����
		String img=null;
		int maxSize=1024*1024*10;
		//String uploadPath="C:\\BackendToyProject\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\album_img";
		String uploadPath=request.getSession().getServletContext().getRealPath("/album_img");
		System.out.println("img"+uploadPath);
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
			Enumeration files = multi.getFileNames();
			while(files.hasMoreElements()) {
					String file01=(String)files.nextElement();
					img= multi.getFilesystemName(file01);
					File file= multi.getFile(file01);
					
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		p.setP_img("/servlet_music/album_img/"+img);
		ProductService.addProduct(p);
		String path = "/servlet_music/ProductListController";
		response.sendRedirect(path);
	}

}
