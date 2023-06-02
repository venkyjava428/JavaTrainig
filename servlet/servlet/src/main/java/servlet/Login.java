package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.setContentType("text/html");

		PrintWriter wr = res.getWriter();
		
		wr.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "  <title>Login Form</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "  <h2>Login</h2>\r\n"
				+ "  <form action=\"/login\" method=\"POST\">\r\n"
				+ "    <div>\r\n"
				+ "      <label for=\"username\">Username:</label>\r\n"
				+ "      <input type=\"text\" id=\"username\" name=\"username\" required>\r\n"
				+ "    </div>\r\n"
				+ "    <div>\r\n"
				+ "      <label for=\"password\">Password:</label>\r\n"
				+ "      <input type=\"password\" id=\"password\" name=\"password\" required>\r\n"
				+ "    </div>\r\n"
				+ "    <div>\r\n"
				+ "      <input type=\"submit\" value=\"Login\">\r\n"
				+ "    </div>\r\n"
				+ "  </form>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
		


	}
	
	      

}
