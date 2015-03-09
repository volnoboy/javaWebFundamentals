package com.volnoboy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/2/15 7:57 PM
 */
public class ControllerServlet extends HttpServlet {

	public void init() {
		ApplicationSettings applicationSettings = new ApplicationSettings();
		CssClass cssClass = new CssClass();
		cssClass.setName("blueUser");
		List<Tab> tabs = new ArrayList<>();
		tabs.add(new Tab("SignIn", "#signin"));
		tabs.add(new Tab("home", "#home"));
		tabs.add(new Tab("Profile", "#profile"));
		tabs.add(new Tab("Messages", "#messages"));
		tabs.add(new Tab("Settings", "#settings"));
		String[] tabNames = {"SignIn", "Home", "Profile", "Settings"};
		applicationSettings.setTabs(tabs);
		applicationSettings.setFormCssClass(cssClass);
		applicationSettings.setTabNames(tabNames);
		getServletContext().setAttribute("app", applicationSettings);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user  = new User();
		user.setName("Valera");
		user.setEmail("valera@mozgov.net");
		user.setAvatarUrl("images/valera.jpg");
		List<Todo> todos = new ArrayList<>();
		todos.add(new Todo("Finish Cource", 1));
		todos.add(new Todo("Go for a run", 3));
		user.setTodos(todos);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	}
}
