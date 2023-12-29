package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Profile extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		PrintWriter pw = res.getWriter();
		pw.write("<h1> Welcome "+ req.getParameter("uname"));
		pw.write("<a href='contact'>contact</a>");
		pw.write("<a href='logout'>logout</a>");	}

	
}

