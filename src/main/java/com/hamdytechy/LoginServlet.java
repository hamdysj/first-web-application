/* I got this (protected void doGet()) down here from HttpServlet Class
 * I got access to the class by Right-Clicking on the project ---- Maven ---- Download Java Doc
 * project ---- Maven ---- Download Sources
 * Under Java Resources --- Libaries ---- Maven Dependencies, 
 * javaee-web-api-6.0 jar has been downloaded
 * Drop it down and select HttpServlet Package
 * 
 * */


//To Print on the browser
		/*
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Learning JAVA WEB APP </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Excited to be Here, Alhamdulillah");
		out.println("</body>");
		out.println("</html>"); */
		
		//We should use JSP for a dynamic and more robust web pages,
		/*To Create a JSP
		 * From src---- webapp---- WEBINF
		 * Right-Click on WEB-INF to create a new folder
		 * Name it views
		 * Right CLick on views to create a JSP file
		 * That's it
		 * */


package com.hamdytechy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Add URL
@WebServlet(urlPatterns = "/login.do")

//LoginServlet inherits HttpServlet
public class LoginServlet extends HttpServlet{
	
	//Create an instance of UserValidationService Class
	private UserValidationService service = new UserValidationService();
	
//doGet Method
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException
	{
		//To redirect the servlet to a JSP page here
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		
		//Get Parameter from the browser
				//String name = request.getParameter("name");
				
				//set Attribute for JSP Page access
				//request.setAttribute("name", name);
	}
	
//doPost Method	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		//User class instance Here
		boolean isValid = service.isUserValid(name, password);
		
		if(isValid) {
			request.setAttribute("name", name);
			request.setAttribute("password", password);	
			//To redirect the servlet to a JSP page here
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
		
			request.setAttribute("errorMessage", "Invalid Credentials");	
		//To redirect the servlet to a JSP page here
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}
	

	}
}
