package com.classes.jdbc;

import com.classes.models.*;
import java.sql.*;

public class HandleDB {
	public boolean getUser(User user) {

		String id,pass;
		id= user.getId();
		boolean ret=false;
		pass = user.getPassword();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://139.162.54.153:3306/shasha1992", "root", "root");

			PreparedStatement preparedStatement = con.prepareStatement("select * from users where id=? and password=?");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pass);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next())
			{
				ret=true;
			}
			else
			{
				ret=false;
			}
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		finally{
			
		}
		return ret;
	}
}
