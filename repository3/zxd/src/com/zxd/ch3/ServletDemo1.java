package com.zxd.ch3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//ͨ��HttpServletResponse��������ҳ����Ӧ�����ʽ
		response.setContentType("text/html;charset=UTF-8");
				// �õ������PrinterWriter����,Servletʹ���������������Ӧ
				PrintWriter printWriter = response.getWriter();
				//ͨ��PrintWriter������ҳ���ӡ��Ϣ
				printWriter.write("ʵ�ֵ�һ��servlet����");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
