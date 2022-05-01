package com.self.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoronaServlet
 */
@WebServlet("/coronaServlet.json")
public class CoronaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoronaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//{"권경완":"개천재" , "알겠냐":"십새들아?"}
		
		String result = "[{\r\n"
				+ "	\"address\": \"울산광역시 동구 봉수로 285\",\r\n"
				+ "	\"centerName\": \"코로나19 울산광역시 동구 예방접종센터\",\r\n"
				+ "	\"centerType\": \"지역\",\r\n"
				+ "	\"createdAt\": \"2021-04-14 08:23:59\",\r\n"
				+ "	\"facilityName\": \"전하체육센터\",\r\n"
				+ "	\"id\": 99,\r\n"
				+ "	\"lat\": \"35.5120985\",\r\n"
				+ "	\"lng\": \"129.4220994\",\r\n"
				+ "	\"org\": \"\",\r\n"
				+ "	\"phoneNumber\": \"052-209-4101\",\r\n"
				+ "	\"sido\": \"울산광역시\",\r\n"
				+ "	\"sigungu\": \"동구\",\r\n"
				+ "	\"updatedAt\": \"2021-07-16 04:55:26\",\r\n"
				+ "	\"zipCode\": \"44020\"\r\n"
				+ "}, {\r\n"
				+ "	\"address\": \"울산광역시 동구 봉수로 285\",\r\n"
				+ "	\"centerName\": \"코로나19 울산광역시 동구 예방접종센터\",\r\n"
				+ "	\"centerType\": \"지역\",\r\n"
				+ "	\"createdAt\": \"2021-04-14 08:23:59\",\r\n"
				+ "	\"facilityName\": \"전하체육센터\",\r\n"
				+ "	\"id\": 99,\r\n"
				+ "	\"lat\": \"35.5120985\",\r\n"
				+ "	\"lng\": \"129.4220994\",\r\n"
				+ "	\"org\": \"\",\r\n"
				+ "	\"phoneNumber\": \"052-209-4101\",\r\n"
				+ "	\"sido\": \"울산광역시\",\r\n"
				+ "	\"sigungu\": \"동구\",\r\n"
				+ "	\"updatedAt\": \"2021-07-16 04:55:26\",\r\n"
				+ "	\"zipCode\": \"44020\"\r\n"
				+ "}]";
		
		
		resp.getWriter().print(result);
		
		
	}
}
