package com.dxc.msf.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.msf.model.UserDTO;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveOrUpdate(UserDTO user) {
		getSessionFactory().getCurrentSession().saveOrUpdate(user);
	}
	
	

	
	public List<UserDTO> getListUser() {
		// TODO Auto-generated method stub
		return (List<UserDTO>) getSessionFactory().getCurrentSession().createQuery("from users").list();
	}

//	@Override
//	public boolean createUser(UserDTO user) {
//		try {
//			Session session = getSessionFactory().openSession();
//			Transaction transaction = session.beginTransaction();
//			session.save(user);
//			transaction.commit();
//			session.close();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
//
//	@Override
//	public List<UserDTO> getListUser() {
//		Session session = getSessionFactory().openSession();
//		Transaction transaction = session.beginTransaction();
//		try {
//			Query query = session.createQuery("select u from User u");
//			List<UserDTO> list = query.list();
//			transaction.commit();
//			return list;
//		} catch (Exception e) {
//			return null;
//		} finally {
//			session.close();
//		}
//
//	}
//
//	@Override
//	public boolean updateUser(UserDTO user) {
//		try {
//			Session session = getSessionFactory().openSession();
//			Transaction transaction = session.beginTransaction();
//			session.update(user);
//			transaction.commit();
//			session.close();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
//
//	@Override
//	public boolean deleteUser(UserDTO user) {
//		try {
//			Session session = getSessionFactory().openSession();
//			Transaction transaction = session.beginTransaction();
//			session.delete(user);
//			transaction.commit();
//			session.close();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}

}
