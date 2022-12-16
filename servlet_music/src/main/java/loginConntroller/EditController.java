package loginConntroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
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
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		MemberService service= new MemberServiceImpl();
		String email = request.getParameter("email"); 
		String pwd = request.getParameter("pwd"); 
		String name = request.getParameter("name"); 
		String birth = request.getParameter("birth"); 
		String gender = request.getParameter("gender");
		String MembershipPlan= request.getParameter("MembershipPlan");
		Member m = new Member(email,pwd,name,birth,gender,MembershipPlan);
		service.editMember(m);
		String path = "/ProductListAllController";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
	}

}
