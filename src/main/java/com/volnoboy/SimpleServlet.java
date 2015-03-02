package com.volnoboy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Created by Reuven on 2/28/15.
*/
@WebServlet(urlPatterns = {"/home"}, name="SimpleServlet", initParams = {@WebInitParam(name = "ProductName", value = "Welcome Application")})
public class SimpleServlet extends HttpServlet {
	String appName = "My application";

	@Override
	public void init() {
		appName = getInitParameter("ProductName");
		appName = getServletContext().getInitParameter("ProductName");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name  = request.getParameter("name");
		if (name != null) {
			response.setContentType("text/xml");
			response.getWriter().printf(
					"<application>" +
					"<name>Hello %s</name>" +
					"<product>%s</product>" +
					"</application>", name, appName);
		} else {
			throw new ServletException("A name shoul be entered");
		}
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
	}
}
