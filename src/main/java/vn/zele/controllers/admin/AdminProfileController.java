package vn.zele.controllers.admin;

import java.io.IOException;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.zele.entity.Account;
import vn.zele.services.IAccountServices;
import vn.zele.services.impl.AccountServicesImpl;

@WebServlet(urlPatterns = {"/admin/profile"})
public class AdminProfileController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	IAccountServices service = new AccountServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) 
    	{
        req.getRequestDispatcher("/views/admin/admin-profile.jsp").forward(req, resp);
	    } else {
	        resp.sendRedirect("/login");
	    }
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession();
		// lấy tham số từ view
		String userid = req.getParameter("userid");
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String phonenum = req.getParameter("phonenum");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		

		Account acc = (Account)session.getAttribute("account");
		//acc.setUserid(userid);
		acc.setAddress(address);
		acc.setDob(dob);
		acc.setEmail(email);
		acc.setGender(gender);
		acc.setName(name);
		acc.setPhonenum(phonenum);
		
		// Xử lý bài toán
		String alertMsg = "";
		boolean updated = service.update(acc);
		if (updated == true) {
			alertMsg = "Cap nhat thanh cong";
			req.setAttribute("alert", alertMsg);
			resp.sendRedirect(req.getContextPath() + "/home");
		}
	}
}
