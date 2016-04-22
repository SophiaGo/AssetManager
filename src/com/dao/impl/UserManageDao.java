package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IUserManageDao;
import com.model.User;

public class UserManageDao extends HibernateDaoSupport implements IUserManageDao{

	@Override
	public void create(User user) {
		super.getHibernateTemplate().save(user);
		
	}


	@Override
	public void update(User user) {
		super.getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public void remove(User user) {
		super.getHibernateTemplate().delete(user);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findUser(final String userID) {
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session.createCriteria(User.class);
							list = (List<User>)criteria.add(Restrictions.eq("user", userID)).list();
							return list;
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						return list;
					}		
				});

	}

}
