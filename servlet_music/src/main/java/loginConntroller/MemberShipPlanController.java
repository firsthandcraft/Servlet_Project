package loginConntroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import model.Product;
import service.MemberService;
import service.MemberServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

/**
 * Servlet implementation class MemberShipPlanController
 */
@WebServlet("/MemberShipPlanController")
public class MemberShipPlanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberShipPlanController() {
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
		MemberService service= new MemberServiceImpl();
		HttpSession session = request.getSession(false);//HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환합니다
		ProductService PService=new ProductServiceImpl();
		String email = (String)session.getAttribute("email"); 
		String MembershipPlan= request.getParameter("MembershipPlan");
		Member m = new Member(email,MembershipPlan);
		Product p = new Product(email, MembershipPlan);
		PService.editProductMembershipPlan(p);
		service.editMemberShipPlan(m);
		System.out.println(m);
		System.out.println(p);
		String path = "common/main.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
	}

}
