package loginConntroller;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
 * Servlet implementation class PasswordResetController
 */
@WebServlet("/PasswordResetController")
public class PasswordResetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordResetController() {
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
		//HttpSession session= request.getSession();
		String uuid = UUID.randomUUID().toString();
//		System.out.println(uuid);
		String[] arrID=uuid.split("-");
		String pwd=arrID[0];
//		System.out.println(randomPwd);
		String path = "/member/login.jsp";
		boolean flag=false;
		MemberService service= new MemberServiceImpl();
		String email = request.getParameter("email");
		System.out.println("email : "+email);
		Member ms= service.findMember(email);//ã��
		if(ms!=null) {
			ms.setPwd(pwd);
			service.pwdEditMember(ms);
			System.out.println("m:"+ms);
			//
			  String user = "handcraft0119@gmail.com"; // ���̹��� ��� ���̹� ����, gmail��� gmail ����
		      String password = "ndywogvosygofaxu";   // �н�����
		    
		        // SMTP ���� ������ �����Ѵ�.
		        Properties prop = new Properties();
		        prop.put("mail.smtp.host", "smtp.gmail.com"); 
		        prop.put("mail.smtp.port", 465); 
		        prop.put("mail.smtp.auth", "true"); 
		        prop.put("mail.smtp.ssl.enable", "true"); 
		        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		        
		        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(user, password);
		            }
		        });

		        try {
		            MimeMessage message = new MimeMessage(session);
		            message.setFrom(new InternetAddress(user));

		            //�����ڸ����ּ�
		            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); 

		            // Subject
		            message.setSubject("��й�ȣ ��߱� "); //���� ������ �Է�

		            // Text
		            message.setText("pwd:"+pwd);    //���� ������ �Է�
		            System.out.println("pwd:"+pwd);
		            // send the message
		            Transport.send(message); ////����
		            System.out.println("message sent successfully...");
		            flag=true;
					request.setAttribute("flag", flag);
		        } catch (AddressException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (MessagingException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		}else {
			System.out.println("���� �̸��� ����ġ");
			path = "/member/passwordReset.jsp";
			flag=false;
			request.setAttribute("flag", flag);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		if(dispatcher !=null) {
			dispatcher.forward(request, response);
		}
	}

}
