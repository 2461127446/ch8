package com.ld.ch;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/MyFilter1")
public class MyFilter1 implements Filter {

   
    public MyFilter1() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		// 用于拦截用户的请求，如果和当前过滤器的拦截路径匹配，该方法会被调用
				HttpServletRequest request =(HttpServletRequest)req;
				String username = (String) request.getSession().getAttribute("username");
				if(username ==null){
					request.getRequestDispatcher("/login.jsp").forward(request, resp);
					return;
				}
				else{
					request.getRequestDispatcher("/order.jsp").forward(request, resp);
		}

		chain.doFilter(req, resp);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
