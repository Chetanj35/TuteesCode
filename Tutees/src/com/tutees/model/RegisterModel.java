package com.tutees.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tutees.DB.DBlogics;
import com.tutees.POJO.FacultyBean;
import com.tutees.POJO.StudentBean;

public class RegisterModel {

	
	public int registerFaculty(FacultyBean fb)
	{
		int i=0;
		System.out.println("Chetack2");
		try
		{
			Connection con=DBlogics.Connect();
			System.out.println(fb.getName());
			PreparedStatement ps=con.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fb.getName());
			ps.setString(2, fb.getGender());
			ps.setString(3, fb.getBloodGroup());
			ps.setString(4, fb.getContact());
			ps.setString(5, fb.getEmail());
			ps.setString(6, fb.getPassword());
			ps.setString(7, fb.getCollegeID());
			ps.setString(8, fb.getDesignation());
			ps.setString(9, fb.getCoordinatorOf());
			ps.setString(10, fb.getSubjectTeaching());
			ps.setString(11, fb.getClassesTeaching());
			ps.setString(12, fb.getQualification());
			
			i=ps.executeUpdate();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return i;
	}


public int registerStudent(StudentBean sb)
{
	int i=0;

	try
	{
	Connection con=DBlogics.Connect();
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+sb.getPhoto()+")");
	ps.setString(1,sb.getName() );
	ps.setString(2, sb.getGender());
	ps.setString(3, sb.getDob());
	ps.setString(4, sb.getFather());
	ps.setString(5, sb.getMother());
	ps.setString(6, sb.getLocalAdd());
	ps.setString(7, sb.getPermanentAdd());
	ps.setString(8, sb.getEmail());
	ps.setString(9, sb.getPassword());
	ps.setString(10,sb.getContact());
	ps.setString(11,sb.getBloodGroup());
	ps.setString(12,sb.getBranchID());
	ps.setString(13,sb.getCourseID());
	ps.setString(14, sb.getSemester());
	ps.setString(15,sb.getYoa());
	ps.setString(16,sb.getEnrollNo());
	ps.setString(17,sb.getScholarID());
	ps.setString(18,sb.getAttendence());
	ps.setString(19,sb.getCaste());
	ps.setString(20,sb.getSection());
	ps.setString(21,sb.getRating());
	ps.setString(22,sb.getCr());
	ps.setString(23,sb.getAge());
	ps.setString(24,sb.getFatherContact());
	
	i=ps.executeUpdate();
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return i;
	}
}