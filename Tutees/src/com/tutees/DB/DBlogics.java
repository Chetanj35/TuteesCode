package com.tutees.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBlogics {

	 public static Connection Connect()
	 {	Connection con=null;
		 try
		 {
		 
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tutees","root","root");
	 
		 }
		 
		 catch(Exception e)
		 {
			 
			 e.printStackTrace();
			 
		 }
		 return con;
	}
}
