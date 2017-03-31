package com.tutees.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tutees.POJO.UserBean;
import com.tutees.model.LoginModel;
//comment

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int i;
		UserBean ub=new UserBean();
		ub.setId(request.getParameter("id"));
		ub.setPassword(request.getParameter("password"));
		ub.setUserType(request.getParameter("user"));

		LoginModel lm=new LoginModel();
		
		i=lm.Login(ub);
		
		if(i==1)
		{
			HttpSession s=request.getSession();
			s.setAttribute("id", request.getParameter("id"));
			response.sendRedirect("AdminHome.jsp");
		}
	}

}
