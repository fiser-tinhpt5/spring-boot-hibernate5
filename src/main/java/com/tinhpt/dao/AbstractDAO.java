package com.tinhpt.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by septechuser on 26/12/2016.
 */
@Transactional
public class AbstractDAO<T, PK extends Serializable> {

    private final Class<T> persistentClass;

    public AbstractDAO() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Session openSession() {
        return sessionFactory.openSession();
    }

    @SuppressWarnings("unchecked")
    public T findById(PK pk) {
        return (T) getSession().get(persistentClass, pk);
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    public void update(T entity) {
        getSession().update(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }

    public List<T> findAll() {
        return createEntityCriteria().list();
    }
}
