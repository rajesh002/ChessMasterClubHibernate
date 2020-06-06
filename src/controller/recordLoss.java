package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlayerOperations;

/**
 * Servlet implementation class recordLoss
 */
@WebServlet("/recordLoss")
public class recordLoss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public recordLoss() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlayerOperations playeroperations=new PlayerOperations();
		int tournamentID =  Integer. parseInt(request.getParameter("tournamentID"));
		int playerId = Integer. parseInt(request.getParameter("playerId"));
		int noOfloss= Integer. parseInt(request.getParameter("numberOFLoss"));
		try {
			playeroperations.addLosses(playerId, noOfloss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/adminView.jsp");
		rd.forward(request, response);
	}

}
