package productController;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.MemberService;
import service.MemberServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

/**
 * Servlet implementation class ProductDelController
 */
@WebServlet("/ProductDelController")
public class ProductDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDelController() {
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
		String p_title= request.getParameter("p_title");
		Product p = ProductService.findProduct(p_title);
		ProductService.delProduct(p_title);
		String uploadPath="C:\\BackendToyProject\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\album_img\\";
		String arr[]=p.getP_img().split("/");
		String fname=arr[arr.length-1];//�迭�� 0���� ����
		File f= new File(uploadPath+fname);
		f.delete();
		String path = "/servlet_music/ProductListController";
		response.sendRedirect(path);
	}

}
