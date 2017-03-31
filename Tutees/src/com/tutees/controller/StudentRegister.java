package com.tutees.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tutees.POJO.FacultyBean;
import com.tutees.POJO.StudentBean;
import com.tutees.model.RegisterModel;

@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegister() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean sb=new StudentBean();
		sb.setBloodGroup(request.getParameter("bloodGroup"));
		sb.setBranchID(request.getParameter("branchID"));
		sb.setCaste(request.getParameter("caste"));
		sb.setContact(request.getParameter("contact"));
		sb.setCourseID(request.getParameter("courseID"));
		sb.setDob(request.getParameter("dob"));
		sb.setEmail(request.getParameter("email"));
		sb.setEnrollNo(request.getParameter("enrollNo"));
		sb.setFather(request.getParameter("father"));
		sb.setFatherContact(request.getParameter("fatherContact"));
		sb.setGender(request.getParameter("gender"));
		sb.setLocalAdd(request.getParameter("localAdd"));
		sb.setMother(request.getParameter("mother"));
		sb.setName(request.getParameter("name"));
		sb.setPassword(request.getParameter("password"));
		sb.setPermanentAdd(request.getParameter("permanentAdd"));
		//sb.setPhoto(request.getParameter("photo"));
		sb.setRating(request.getParameter("rating"));
		sb.setScholarID(request.getParameter("scholarID"));
		sb.setSection(request.getParameter("section"));
		sb.setSemester(request.getParameter("semester"));
		sb.setYoa(request.getParameter("yoa"));
		
		
		RegisterModel rm=new RegisterModel();
		 int i=rm.registerStudent(sb);
		 if(i!=0)
		 {
			 response.sendRedirect("AdminHome.jsp");
		 }
		 else
		 {
			 response.sendRedirect("StudentRegister.jsp");
		 }
	}
}

