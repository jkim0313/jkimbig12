package com.jkim0313.com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String usernm = request.getParameter("nm");
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");

		System.out.println("사용자 입력한 이름: " + usernm);
		System.out.println("사용자 입력한 아이디: " + userid);
		System.out.println("사용자 입력한 비밀번호: " + userpw);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("이름 : " + usernm + "<br>");
		out.print("아이디 : " + userid + "<br>");
		out.print("비밀번호 : " + userpw + "<br>");
	}

	private static final long serialVersionUID = 1L;
	
	public FormEx() {
		super();
	}
	
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {

	}

}
