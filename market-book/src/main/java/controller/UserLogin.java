package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserInterfaceDAO;
import dao.UserQueryDAO;
import services.UserServiceImplemantation;
import services.UserServiceInterface;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserInterfaceDAO dao = new UserQueryDAO();
		UserServiceInterface usi = new UserServiceImplemantation(dao);
		String status = usi.loginUser(email, password);
		
		
		System.out.println("here  "+status);
		if(status.equals("success")) {
			response.sendRedirect("Success.jsp");
		}else {
			response.sendRedirect("Fail.jsp");
		}
	}

}
