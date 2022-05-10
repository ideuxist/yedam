package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		String price = request.getParameter("price");
		
		if(code.isEmpty() || title.isBlank() || author.isBlank() || press.isBlank() || price.isBlank()){
			request.setAttribute("error", author);
			request.getRequestDispatcher("view/modify.jsp").forward(request, response);
		}
		//pageContext.servletContext.contextPath 
		BookVO vo = new BookVO();
		vo.setBookCode(code);
		vo.setBookTitle(title);
		vo.setBookAuthor(author);
		vo.setBookPress(press);
		vo.setBookPrice(Integer.parseInt(price));
		
		BookService service = new BookService();
		
		service.modifyBook(vo);
		
		request.setAttribute("title", title);
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
		
		
		
		
	}

}
