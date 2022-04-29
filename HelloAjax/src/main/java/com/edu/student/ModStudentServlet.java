package com.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModStudentServlet
 */
@WebServlet("/ajax/modStudentServlet")
public class ModStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModStudentServlet() {
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
		//`modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String sNo = req.getParameter("a");
		String Sname = req.getParameter("b");
		String eng = req.getParameter("c");
		String kor = req.getParameter("d");
		
		Student std = new Student();
		std.setStudentNo(Integer.parseInt(sNo));
		std.setStudentName(Sname);
		std.setEngScore(Integer.parseInt(eng));
		std.setKorScore(Integer.parseInt(kor));
		
		StudentDAO dao = new StudentDAO();
		boolean success = dao.modifyStudent(std);
		
		if(success) {
			//resp.getWriter().println("{\"retCode\"");
			//{"retCode" : "Success", "studNo":"+sNo
			resp.getWriter().println("{\"retCode\":\"OK\", \"studNo\":"+sNo+",\"studName\":\""+Sname+"\",\"engScore\":"+eng+",\"korScore\":"+kor+"}");
		}else {
			
		}
		
	}

}
