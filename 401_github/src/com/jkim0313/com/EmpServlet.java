package com.jkim0313.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EmpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {response.getWriter().append("Served at: ").append(request.getContextPath());
			doPost(request, response);
	}

	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String empno = request.getParameter("empno"); 
		String empnm = request.getParameter("empnm"); 
		String deptno = request.getParameter("deptno");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>사원정보 등록</h1>");
		out.print("사원번호 : " + empno);
		out.print("사원명 : " + empnm);
		out.print("부서번호 : " + deptno);
		out.print("성별 : " + sex);
		out.print("취미 : ");
		for(int i=0;i<hobby.length;i++) {
			out.println(hobby[i] + ", ");
		}
		
		out.close();
	}

}
