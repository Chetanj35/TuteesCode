package com.tutees.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tutees.POJO.FacultyBean;
import com.tutees.model.RegisterModel;


@WebServlet("/FacultyRegister")
public class FacultyRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    
    public FacultyRegister() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i;
		System.out.println("Chetack1");
		FacultyBean fb=new FacultyBean();
		fb.setName(request.getParameter("name"));
		fb.setBloodGroup(request.getParameter("bloodGroup"));
		fb.setClassesTeaching(request.getParameter("classesTeaching"));
		fb.setCollegeID(request.getParameter("collegeID"));
		fb.setContact(request.getParameter("contact"));
		fb.setCoordinatorOf(request.getParameter("coordinatorOf"));
		fb.setDesignation(request.getParameter("designation"));
		fb.setEmail(request.getParameter("email"));
		fb.setGender(request.getParameter("gender"));
		fb.setPassword(request.getParameter("password"));
		fb.setQualification(request.getParameter("qualification"));
		fb.setSubjectTeaching(request.getParameter("subjectTeaching"));
		
		
		RegisterModel rs=new RegisterModel();
		i=rs.registerFaculty(fb);
		System.out.println("Chetack3");
		System.out.println(i);
		if(i!=0)
		{
			response.sendRedirect("AdminHome.jsp");
		}
		
		else
		{
			response.sendRedirect("FacultyForm.jsp");
		}
		
	}

}
