package com.zy.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements com.zy.dao.UserDao {

    private SessionFactory sessionFactory;

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveUser(com.zy.entity.User user) {
       // Session session = sessionFactory.getCurrentSession();
       // session.save(user);
        hibernateTemplate.save(user);
    }
}
