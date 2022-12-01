package musicController;

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
import model.Music;
import service.MemberService;
import service.MemberServiceImpl;
import service.MusicService;
import service.MusicServiceImpl;

/**
 * Servlet implementation class minsertController
 */
@WebServlet("/minsertController")
public class minsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public minsertController() {
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
		MusicService service = new MusicServiceImpl();
		MemberService service2=new MemberServiceImpl();
		HttpSession session = request.getSession(false);//HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환합니다
		String s_email=(String)session.getAttribute("email");
		Music m = new Music();
		m.setS_email(s_email);
		Member b =service2.findMember(s_email);
		boolean flag =false;
		String seller=b.getMembershipPlan();
		m.setMseller(seller);
		System.out.println("seller"+seller);
		
		//image 멀티파트: request, 파일저장경로,용량, 인코딩, 중복파일
		String img=null;
		int maxSize=1024*1024*10;
		String uploadPath="C:\\backendminiproject\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\album_img";
		File upDir=new File(uploadPath);
		if(!upDir.exists()) {
			upDir.mkdir();
		}
		System.out.println("minsert - upDir"+upDir);
		try {
			// MultipartRequest형식 :request,파일저장경로,용량,인코딩타입,중복파일명에 대한 기본 정책
			MultipartRequest multi = new MultipartRequest(request, uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
			m.setMtitle(multi.getParameter("Mtitle"));
			m.setMproducer(multi.getParameter("Mproducer"));
			m.setMtext(multi.getParameter("Mtext"));
			m.setMimg(multi.getParameter("Mimg"));
			Enumeration files = multi.getFileNames();
			while(files.hasMoreElements()) {
					String file01=(String)files.nextElement();
					img= multi.getFilesystemName(file01);
					File file= multi.getFile(file01);
					
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		m.setMimg("/album_img"+img);
		service.addMusic(m);
		String path = "/msearchController";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
