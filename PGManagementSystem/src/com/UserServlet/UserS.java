package com.UserServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.De;
import com.dao.UserDao;


@WebServlet("/")
public final class UserS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlt path for different pages different servlet path with the help of switch
		
		String path=request.getServletPath();
		
		switch(path){
		case"/add":
			useradd(request,response);
			break;
		case"/insert":
			insertuser(request,response);
			break;
		case"/delete":
			deleteUser(request,response);
			break;
		case"/edit":
			editDetails(request,response);
			break;
		case"/update":
			updateUser(request,response);
			break;
		case"/list":
			userlist(request,response);
			break;
		case"/AregP":
			admREG(request,response);
			break;
		case"/insertR":
			admform(request,response);
			break;
		case"/userchek":
			userchek(request,response);
			break;

		default: 
			adminAcces(request,response);
			break;
	 
		}
	}

	
	private void userchek(HttpServletRequest request, HttpServletResponse response) {
		
		String email=request.getParameter("email");
		String psw=request.getParameter("psw");
		UserDao ur =new UserDao();
		boolean c=ur.check(email, psw);
		
		if(c==true) {
			try {
				response.sendRedirect("list");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			RequestDispatcher rq=request.getRequestDispatcher("UserLogin.jsp");
			try {
				rq.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String  mobile=request.getParameter("mobile");
		De b=new De(id, name, email, mobile);
		UserDao a =new UserDao();
		a.update2(b);
		try {
			response.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void admform(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String aname=request.getParameter("Rname");
		String aemail=request.getParameter("Remail");
		String apassword=request.getParameter("Rpsw");
		String anumber=request.getParameter("Rnumber");
		De s=new De(aname,aemail,apassword,anumber);
		request.setAttribute("Adm", s);
		UserDao a =new UserDao();
		a.insert1(s);
		RequestDispatcher d=request.getRequestDispatcher("UserLogin.jsp");
		try {
			d.forward(request, response);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			response.sendRedirect("welcomefile");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void admREG(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher d=request.getRequestDispatcher("admForm.jsp");
		try {
		d.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void adminAcces(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		RequestDispatcher d=request.getRequestDispatcher("UserLogin.jsp");
		try {
			d.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void editDetails(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id1=Integer.parseInt(request.getParameter("id"));
		UserDao a =new UserDao();
		De b=a.update(id1);
		request.setAttribute("lis",b);
		RequestDispatcher r=request.getRequestDispatcher("PgForm.jsp");
		try {
			r.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		// delete with id
		
		int id = Integer.parseInt(request.getParameter("id"));
		UserDao a =new UserDao();
		a.delete(id);
		try {
			response.sendRedirect("list");
	 	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	private void insertuser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		De u=new De(name,email,mobile);
		UserDao a =new UserDao();
		a.insert(u); 
		
		
			try {
				response.sendRedirect("list");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	private void useradd(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher re=request.getRequestDispatcher("PgForm.jsp");
		try {
			re.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private void userlist(HttpServletRequest request, HttpServletResponse response) {
		UserDao a =new UserDao();
		ArrayList<De> b=a.select();
		request.setAttribute("display", b);
		
		RequestDispatcher re=request.getRequestDispatcher("PgList.jsp");
	
		try {
			re.forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		try {
			response.sendRedirect("welcome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
