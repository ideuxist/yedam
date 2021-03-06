package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet.do")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RequestServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
	System.out.println("init() call");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() call");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;cahrset=UTF-8");
		PrintWriter out = response.getWriter();//출력스트림
		out.print("<h3>홍길동</h3>");
		out.print("<h3>네트워크정보</h3>");
		out.print("Request Scheme: "+request.getScheme()+"<br>");
		out.print("Server Name: " + request.getServerName()+"<br>");
		out.print("Server Addresss: "+request.getLocalAddr()+"<br>");
		out.print("Client Address: " +request.getRemoteAddr()+"<br>");
		out.print("Client Port: " +request.getRemotePort()+"<br>");
		
		out.print("<h3>요청 프로토콜</h3>");
		out.print("Request URI: "+ request.getRequestURI()+"<br>");
		out.print("Context path: "+ request.getContextPath()+"<br>");
		out.print("Context protocol: "+ request.getProtocol()+"<br>");
		out.print("Server Path :"+ request.getServletPath()+"<br>");
		out.print("id :"+request.getParameter("id")+"<br>");
		out.print("passwd: "+request.getParameter("passwd")+"<br>");
		out.print("user_name: "+request.getParameter("user_name")+"<br>");
		out.print("quetyString : " +request.getQueryString()+"<br>");
		
		out.close();
		
		}

}
