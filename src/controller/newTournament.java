package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TournamentOperations;

/**
 * Servlet implementation class newTournament
 */
@WebServlet("/newTournament")
public class newTournament extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newTournament() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/adminView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate startDate,endDate;
		TournamentOperations tournamentOperations=new TournamentOperations();
		
		String tournamentName = request.getParameter("tournamentName"); 
		String StartDate = request.getParameter("startDate"); 
		String EndDate = request.getParameter("endDate"); 
		
		startDate=LocalDate.parse(StartDate);
		endDate=LocalDate.parse(EndDate);
		try {
			tournamentOperations.addNewTournament(tournamentName,startDate,endDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/adminView.jsp");
		rd.forward(request, response);
	}

}
