package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Login;
import services.UserDAOInterface;
import utility.ConnectionManager;
import utility.HibernateConnectionManager;

public class UserDAO implements UserDAOInterface {
	
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();
	
	@Override
	public boolean admin(String username, String password) throws Exception{
		Login login=new Login(username,password);

		Session session = this.sessionFactory.openSession();
		Transaction tx=null;
		try{
			tx=(Transaction) session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Login where username='"+login.getUsername()+"'"+"and password='"+login.getPassword()+"'");
			login=(Login)query.uniqueResult();
			tx.commit();
		}catch (Exception e) {
			if(tx!=null) {
				try {
					tx.rollback();
				}catch(IllegalStateException e1) {
					e1.printStackTrace();
				}
			}
		e.printStackTrace();
		}
		finally {
			session.close();
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void signUp(String username, String password) throws Exception {
		Login login=new Login(username,password);
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if(session.save(login)!=null) {
			transaction.commit();
			session.close();
		}
	}

	@Override
	public boolean login(String username, String password) throws Exception {
		Login login=new Login(username,password);
		
		Session session = this.sessionFactory.openSession();
		Transaction tx=null;
		try{
			tx=(Transaction) session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Login where username='"+login.getUsername()+"'"+"and password='"+login.getPassword()+"'");
			login=(Login)query.uniqueResult();
			tx.commit();
		}catch (Exception e) {
			if(tx!=null) {
				try {
					tx.rollback();
				}catch(IllegalStateException e1) {
					e1.printStackTrace();
				}
		}
		e.printStackTrace();
		}
		finally {
			session.close();
		}
		return true;
		}
		}


