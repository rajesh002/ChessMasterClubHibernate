package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username"); 
		String password = request.getParameter("password"); 
		
		HttpSession session = request.getSession(true);

		UserDAO userdao= new UserDAO();
		try {
			if(userdao.admin(username,password)) {
				session.setAttribute("username", request.getParameter("Username"));
				session.setAttribute("password", request.getParameter("password"));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/adminView.jsp");
				rd.forward(request, response);
			}
			else if(userdao.login(username,password)) {
				session.setAttribute("username", request.getParameter("Username"));
				session.setAttribute("password", request.getParameter("password"));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/userView.jsp");
				rd.forward(request, response);
			}
				else
				{
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
					rd.forward(request, response);
				}	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
