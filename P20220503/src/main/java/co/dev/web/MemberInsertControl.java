package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.println("입력처리하는 컨트롤입니다");
		
		//multipart:request,saveDir,maxSize.encoding,renamePolicy
		String saveDir = "upload";
		saveDir = request.getServletContext().getRealPath(saveDir);
		int maxSize = 1024*1024*10;
		String encoding = "UTF-8";
		// multipart 요청.
		// request,저장위치,최대 사이즈, 인코딩,리네임정책 (파일중복시 file.jpg >file1.jpg)
		MultipartRequest multi = new MultipartRequest(request,saveDir,maxSize,encoding,new DefaultFileRenamePolicy());
		
		
		String id = multi.getParameter("id");
		String ps = multi.getParameter("passwd");
		String nm = multi.getParameter("name");
		String em = multi.getParameter("email");
		String pf = multi.getFilesystemName("profile");
		
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(nm);
		vo.setEmail(em);
		vo.setPasswd(ps);
		vo.setProfile(pf);
		
		MemberService service = new MemberService();
		service.memberInsert(vo);
		
		request.setAttribute("id", id);
		request.setAttribute("name", nm);
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request, response);
		
		
	}

}
