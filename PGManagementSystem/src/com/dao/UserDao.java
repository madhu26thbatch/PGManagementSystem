package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.De;
import com.mysql.cj.protocol.Resultset;


public  final class UserDao {
	String url="jdbc:mysql://localhost:3306/madhu1";
	 String user="root";
	 String password="madhu123";
	Connection con=null;
	PreparedStatement s=null;
	Statement g=null;
	String delete="Delete from PgManagement where id=  ?";
	String update="update PgManagement set name= ?,email= ?,mobile= ?where id= ? ";

	public  void  insert(De a) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			s=con.prepareStatement("insert into pgManagement(name,email,mobile) values(?,?,?)");
			s.setString(1,a.getName());
			s.setString(2,a.getEmail());
			s.setString(3,a.getMobile());
			s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<De> select(){
		ArrayList<De> al= new ArrayList<De>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			 g=con.createStatement();
			ResultSet rs=g.executeQuery("select* from pgManagement");
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String mobile=rs.getString("mobile");
				De b=new De(id,name,email,mobile);
				al.add(b);
			}
			
			g.close();
			con.close();
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	public void delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			 s=con.prepareStatement(delete);
			s.setInt(1,id);
			s.executeUpdate();
			
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				s.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	public De update(int id1) {
		De b=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			s=con.prepareStatement("select* from PgManagement where id= ?");
			s.setInt(1, id1);
			ResultSet a= s.executeQuery();
			while(a.next()) {
			int id=a.getInt("id");
			String name=a.getString("name");
			String email=a.getString("email");
			String mobile=a.getString("mobile");
			 b=new De(id,name,email,mobile);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				s.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;
	}
public  void  insert1(De a) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			s=con.prepareStatement("insert into admf1(name,email,password,mobile) values(?,?,?,?)");
			s.setString(1,a.getAname());
			s.setString(2,a.getAemail());
			s.setString(3,a.getApassword());
			s.setString(4,a.getAnumber());
			s.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				s.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public void update2(De a) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,user,password);
		s=con.prepareStatement(update);
		s.setString(1, a.getName());
		s.setString(2,a.getEmail());
		s.setString(3,a.getMobile());
		s.setInt(4, a.getId());
		s.executeUpdate();
		s.close();
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public boolean check(String email,String psw) {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,user,password);
		g=con.createStatement();
		ResultSet rs=g.executeQuery("select email,password from admf1 ");
		while(rs.next()) {
			String e=rs.getString("email");
			String p=rs.getString("password");
			if(e.equals(email) && p.equals(psw)) {
				return true;
			
			}
		}
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			g.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return false;
	
	
	
}

	
}
