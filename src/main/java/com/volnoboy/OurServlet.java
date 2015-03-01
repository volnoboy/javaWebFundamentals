package com.volnoboy;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* Created by Reuven on 2/28/15.
*/
@WebServlet(urlPatterns = {"/home", "/myhome", "*.web"})
public class OurServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name  = request.getParameter("name");
		if (name != null) {
			response.setContentType("text/xml");
			response.getWriter().printf("<name>Hello %s</name>", name);
		} else {
			response.getWriter().write("Please enter name value!");
		}
		//response.getWriter().write("Zelexon");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name  = request.getParameter("name");
		if (name != null && name != "") {
			response.getWriter().printf("Hello %s", name);
		} else {
			response.getWriter().write("Please enter name value!");
			response.sendRedirect("index.jsp");
		}
		//response.getWriter().write("Zelexon");
	}
}
