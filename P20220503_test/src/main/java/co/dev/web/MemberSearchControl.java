package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("한건조회");
		 String id = request.getParameter("id");
		 MemberService service = new MemberService();
		 MemberVO vo = new MemberVO();
		 
		 vo = service.memberSearch(id);
		 request.setAttribute("member", vo);
		 request.getRequestDispatcher("memberResult/memberSearch.jsp").forward(request, response);

	}

}
