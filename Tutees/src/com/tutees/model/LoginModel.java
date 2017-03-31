package com.tutees.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tutees.DB.DBlogics;
import com.tutees.POJO.UserBean;

public class LoginModel {

	public int Login(UserBean ub)
	{
		int i=0;
		try
		{
			
			Connection con=DBlogics.Connect();
		
			PreparedStatement ps=con.prepareStatement("Select * from "+ub.getUserType()+" where ID=? and Password=?");
			//ps.setString(1,ub.getUserType());
			ps.setString(1,ub.getId());
			ps.setString(2,ub.getPassword());
			ResultSet rs=ps.executeQuery();
			 
			if(rs.next())
			{
				i=1;
				ub.setName(rs.getString(1));
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return i;
	}
	
	
}
