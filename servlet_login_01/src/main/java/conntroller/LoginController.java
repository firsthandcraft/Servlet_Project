package conntroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		MemberService service = new MemberServiceImpl();
		boolean flag= false;
		HttpSession session= request.getSession();
		String email= request.getParameter("email");
		String pwd= request.getParameter("pwd");
		Member m = service.findMember(email);//Ã£±â
		String path="/member/main.jsp";
		if(m!=null && pwd.equals(m.getPwd())) {
			session.setAttribute("m", m);
			session.setAttribute("email", email);
			//System.out.println("ggggg"+m.getName());
			flag=true;
			request.setAttribute("flag", flag);
		}else {
			path="/member/login.jsp";
			
			request.setAttribute("flag", flag);
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(path);
		
		if(dispatcher!=null) {
		 dispatcher.forward(request, response);
		}
	}

}
