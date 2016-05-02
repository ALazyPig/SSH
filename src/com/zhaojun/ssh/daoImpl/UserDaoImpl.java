package com.zhaojun.ssh.daoImpl;

import org.hibernate.Session;
import com.zhaojun.ssh.dao.UserDao;
import com.zhaojun.ssh.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		  session.beginTransaction();
		  session.save(user);
	      session.getTransaction().commit();
	}

}
