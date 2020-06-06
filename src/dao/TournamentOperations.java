package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.TournamentDetails;
import services.TournamentDAOInterface;
import utility.ConnectionManager;
import utility.HibernateConnectionManager;

public class TournamentOperations implements TournamentDAOInterface {
	
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();
	
	// Adding new Tournament
	public void addNewTournament(String tournamentName,LocalDate startDate,LocalDate endDate) throws Exception {
		TournamentDetails tournament=new TournamentDetails(tournamentName,startDate,endDate);
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if(session.save(tournament)!=null) {
			transaction.commit();
			session.close();
		}
	}
	
//	// checking tournament ended or not
//	public boolean tournamentNotEnded(int id) throws Exception {
//		LocalDate today=LocalDate.now();
//		LocalDate endDate;
//		Connection con=ConnectionManager.getConnection();
//		PreparedStatement pstmt = con.prepareStatement("select end_date from tournament where id="+id);
//		ResultSet rs = pstmt.executeQuery();
//		rs.next();
//		endDate=rs.getDate("end_date").toLocalDate();
//		con.close();
//		return (today.compareTo(endDate) <= 0); 
//		
//	}
	
	
	public void renameTournament(int id,String name) throws Exception {
		Connection con=ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement("update tournament set name=? where id=?");
		pstmt.setString(1, name);
		pstmt.setInt(2,id);
		pstmt.executeUpdate();
		con.close();
	}
	
	
	
	
	
	public void deleteTournament(int id) throws Exception {
		PreparedStatement pstmt1,pstmt2,pstmt3;
		Connection con=ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select ranking.id from tournament,ranking,players where tournament.id=? and players.tournament_id=tournament.id and players.id=ranking.id");
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			pstmt1 = con.prepareStatement("delete from ranking where ranking.id=+?");
			pstmt1.setInt(1, rs.getInt("id"));
			pstmt1.executeUpdate();
			pstmt2 = con.prepareStatement("delete from players where players.id=+?");
			pstmt2.setInt(1, rs.getInt("id"));
			pstmt2.executeUpdate();
		}
		pstmt3 = con.prepareStatement("delete from tournament where id="+id);
		pstmt3.executeUpdate();
	}
	
	
}
