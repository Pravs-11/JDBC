package com.studentMs;
import java.sql.*;
import java.util.*;

public class studentUser {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/studentMs";
	     String username="root";
	     String password="Pravs@99";
	     Connection cn=DriverManager.getConnection(url,username,password);
	     System.out.println("********Add Students data to DB**********");
	    	System.out.println("Enter student Rollno ");
	    	int srno=sc.nextInt();
	    	System.out.println("Enter student Name");
	    	sc.nextLine();
	    	String sname=sc.nextLine();
	    	System.out.println("Enter student marks");
			int smarks=sc.nextInt();
			
			String query="insert into student values( ?,?,?)";
			
			PreparedStatement pst=cn.prepareStatement(query);
			pst.setInt(1, srno);
			pst.setString(2,sname);
			pst.setInt(3, smarks);
			
			int count=pst.executeUpdate();
			System.out.println(count+" row(s) effected");
			cn.close();
			sc.close();
	        }
	}
