package com.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelStudentServlet
 */
@WebServlet("/ajax/delStudentServlet")
public class DelStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelStudentServlet() {
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
		// TODO Auto-generated method stub
		String id = req.getParameter("delId");
		StudentDAO dao = new StudentDAO();
		boolean suceess= dao.removeStudent(id);
		
		if(suceess) {
			// {"retCode":"OK", "retVal": id}
			resp.getWriter().println("{\"retCode\":\"OK\", \"retVal\":"+id+ "}");
		}else {
			// {"retCode":"NG", "retVal": id}
			resp.getWriter().println("{\"retCode\":\"NG\", \"retVal\":"+id+ "}");
		}
	}

}
