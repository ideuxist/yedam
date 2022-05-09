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

@WebServlet("/ToDoListServlet")
public class ToDoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ToDoListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		ToDoListDAO dao = new ToDoListDAO();
		List<ToDoList> list = dao.getList();
		System.out.println(list);
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
		System.out.println(gson.toJson(list));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String job = request.getParameter("job");
		System.out.println(job);
		ToDoListDAO dao = new ToDoListDAO();
		if (job.equals("delete")) {
			String todo = request.getParameter("todo");
			dao.delete(todo);
		}else if (job.equals("insert")) {
			String todo =request.getParameter("todo");
			dao.insert(todo);
			
		}
		
	}

}
