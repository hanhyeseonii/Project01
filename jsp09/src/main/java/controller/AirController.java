package controller;

import java.beans.Encoder;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Air;
import service.AirService;


@WebServlet("*.air")
public class AirController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AirService airService = new AirService();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		//컨텍스트 패스
		String path = request.getContextPath();
		
		if (uri.contains("pasing")) {
			String year = request.getParameter("year");
			int cnt = airService.airparsing(year);
			String msg = URLEncoder.encode(cnt+"건 저장","utf-8");
			response.sendRedirect(path + "/view/air.jsp?msg="+msg);
					
		}else if (uri.contains("list")) {
			//조회
			String districtName = request.getParameter("districtName");
			List<Map<String, String>> clist= airService.selectList(districtName);
			System.out.println(clist);
			//forward방식
			request.setAttribute("clist",clist);
			request.getRequestDispatcher("/view/air.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
