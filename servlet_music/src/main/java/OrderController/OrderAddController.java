package OrderController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Order;
import service.OrderService;
import service.OrderServiceImpl;

/**
 * Servlet implementation class OrderAddController
 */
@WebServlet("/OrderAddController")
public class OrderAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderAddController() {
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
		OrderService service=new OrderServiceImpl();
		HttpSession session = request.getSession();
		String o_mno=(String)session.getAttribute("mno");
		Order o = new Order();
		o.setO_pnum(request.getParameter("o_pnum"));
//		o.setO_mno(o_mno);
		o.setO_mno("P202301030001");
		o.setO_state(request.getParameter("o_state"));
		service.addOrder(o);
		System.out.println("OrderAddController//mno"+o_mno);
		System.out.println("OrderAddController//SERVLET_MUSIC_PRODUCT_ORDER"+o);
		
		String path="/AlbumListProductListAllController";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
