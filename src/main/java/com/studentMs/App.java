package com.studentMs;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/studentMs";
    	String username="root";
    	String password="Pravs@99";
        Connection cn=DriverManager.getConnection(url,username,password);
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("select * from student");
        System.out.println("srno\tsname\tsmarks\n");
    	while(rs.next())
    	{
    		String Studentdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3);
    		
    		System.out.println(Studentdata);
    	}
        cn.close();
    }
}
