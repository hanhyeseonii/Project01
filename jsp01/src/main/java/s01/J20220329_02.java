package s01;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//확장자 패턴
@WebServlet("*.do")
public class J20220329_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public J20220329_02() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= request.getRequestURI();
		System.out.println(uri);
		
		//삼각형의 넓이를 구하기
		int width=Integer.parseInt(request.getParameter("width"));
		int height=Integer.parseInt(request.getParameter("height"));
		double area=width*height/2;
		
		//forward방식으로 이동
		request.setAttribute("area", area);
		request.getRequestDispatcher("/view/servlet/20220329_02_mapping.jsp").forward(request, response);
	}
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
