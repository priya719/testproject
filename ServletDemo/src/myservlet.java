import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.driver.OracleDriver;

@SuppressWarnings("serial")
public class myservlet extends HttpServlet {		
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String operation = req.getParameter("operation");
		if(operation != null && operation.equals("signin")) {
			  String Username = req.getParameter("username");
			    String Password = req.getParameter("password");

				System.out.println("USERName : "+ Username +", password : "+Password); 

				resp.setContentType("text/html");
				OutputStream os = resp.getOutputStream();
				PrintStream out = new PrintStream(os);
				out.println("<h3>Log In success!</h3>");				
			
		} else 
		{ 
			 String FullName = req.getParameter("fullname");
			    String Email = req.getParameter("email");
			    String Phone = req.getParameter("phone");
			    String UserName = req.getParameter("username");
			    String password = req.getParameter("password");
			    String ConfirmPassword = req.getParameter("password");
			    
			    System.out.println("fullName : "+ FullName +", email : "+Email + ", phone : "+Phone +", Username : "+UserName+", password : "+password+", Confirm Psaaword: "+ConfirmPassword); 
			    resp.setContentType("text/html");
				OutputStream os = resp.getOutputStream();
				PrintStream out = new PrintStream(os);
				out.println("<h3>registration success!</h3>");
		}	
	}
}
