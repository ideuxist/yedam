package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet")
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentGetServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//GET : cmd = search, cmd= null -> null 반환
		
		response.setCharacterEncoding("utf-8");

		String cmd = request.getParameter("cmd");

		if (cmd !=null && cmd.equals("search")) {
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			
			StudentDAO dao = new StudentDAO();
			Student student = dao.searchStudent(id);
			
			
			response.setContentType("text/html;chatset=utf-8");
			if (student != null) {
				response.getWriter().println("<form action = 'StudentGetServlet' method='post'>");
				response.getWriter().println("<h3>아이디 :"+student.getStudentNo()+"</h3>");
				response.getWriter().println("<h3>이름 :"+student.getStudentName()+"</h3>");
				response.getWriter().println("<h3>영어 :<input type = 'number' name = 'eng_score' value ='"+student.getEngScore()+"'></h3>");
				response.getWriter().println("<h3>국어 :<input type = 'number' name = 'kor_score' value ='"+student.getKorScore()+"'></h3>");
				response.getWriter().println("<input type='hidden' name = 'mod' value='mod'>");
				response.getWriter().println("<input type='hidden' name = 'user_id' value='"+student.getStudentNo()+"'>");
				response.getWriter().println("<input type='hidden' name = 'user_name' value='"+student.getStudentName()+"'>");
				response.getWriter().println("<input type = 'button' value ='수정'>");
				response.getWriter().println("</form><br>");
				
			}else {
				response.getWriter().println("<h3>조회된 데이터가 없습니다</h3>");
			}
			response.sendRedirect("studentList.jsp");	
		}else if(cmd !=null && cmd.equals("list")){
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			dao.addStudent(stud);
			
			response.getWriter().print("입력성공");
		
		
		} else {
			response.setContentType("text/json;charset=utf-8");
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(list));
		}
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String cmd = request.getParameter("cmd");
		if(cmd != null && cmd.equals("add")) { //입력기능
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			dao.addStudent(stud);
			response.getWriter().print(stud);
			response.getWriter().print("입력성공");
			response.sendRedirect("studentList.jsp");
			
		} else if (cmd != null && cmd.equals("del")){
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			if (dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제성공')</script>");
			}else {
				response.getWriter().print("<script>alert('삭제실패')</script>");
			}
			response.sendRedirect("studentList.jsp");
		} else if(cmd != null && cmd.equals("mod")) {
			Student stud = new Student();
			
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			StudentDAO dao = new StudentDAO();
			dao.modifyStudent(stud);
			
			
			response.sendRedirect("studentList.jsp");
		}
	}
	
}
		
		
			
		
		
	
	
