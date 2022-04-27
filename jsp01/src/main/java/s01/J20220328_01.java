package s01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//contextpath제외
//jsp01/test  url
//디렉토리 패턴
@WebServlet("/J20220328_01")
public class J20220328_01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String uri =req.getRequestURI();
	 System.out.println(uri);
	 String name = req.getParameter("name");
	 System.out.println(name);
	 int age = Integer.parseInt(req.getParameter("age"));
	 System.out.println(age);
	 //forward : 주소가 안바뀐다. 대량의 데이터 전송
	 //redirect : 주소가 바뀐다. 대량의 데이터 전송 불가
	 
	 //forward방식 이동
	 req.setAttribute("name", name);
	 req.setAttribute("age", age);
	 //절대경로 : contextpath제외 (/view/servlet/20220328_01_mapping.jsp)
	 //상대경로 : view/servlet/20220328_01_mapping.jsp
	 req.getRequestDispatcher("/view/servlet/20220328_01_mapping.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get, post방식 처리 문장 같다
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}
	

}
