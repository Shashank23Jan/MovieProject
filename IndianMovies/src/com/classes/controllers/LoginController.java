package com.classes.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.classes.*;
import com.classes.jdbc.HandleDB;
import com.classes.models.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username,password;
		
		username = request.getParameter("userid").toString();
		password = request.getParameter("pwd").toString();
		
		PrintWriter out = response.getWriter();
		out.println("<p>"+username+"</p>");
		User user = new User(username, password);
		
		
		HandleDB db = new HandleDB();
		
		boolean result = db.getUser(user);
		
		if(result)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("DetailsPanel.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.sendError(500);
		}
		
		
		
		
	}

}
