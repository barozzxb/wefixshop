package vn.zele.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.zele.entity.Account;
import vn.zele.services.IAccountServices;
import vn.zele.services.impl.AccountServicesImpl;

@WebServlet(urlPatterns= {"/login"})
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	IAccountServices accServ = new AccountServicesImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//encoding
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		//get attribute from view
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");
		String alert = "";
		
		//process
		if (userid.isEmpty() || password.isEmpty()) {
			alert = "Please fill out the given fields";
			req.setAttribute("alert", alert);
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}
		Account acc = accServ.login(userid, password);
		if (acc != null) {
			//Start Session
			HttpSession session = req.getSession(true);
			session.setAttribute("account", acc);
			resp.sendRedirect(req.getContextPath() + "/waiting");
		}else {
			alert = "Wrong username or password";
			req.setAttribute("alert", alert);
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}
	}
}
