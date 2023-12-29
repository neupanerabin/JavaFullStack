package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Contact {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String sessionUser = (String) req.getSession().getAttribute("username");
		if(sessionUser !=null) {
			PrintWriter pw = res.getWriter();
			
			
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("./login.html");
			
		}
	}

}
