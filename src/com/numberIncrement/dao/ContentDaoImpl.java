package com.numberIncrement.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.numberIncrement.entity.Numbers;

/*
 * This is the Dao Class where the Query for inserting and deleting and check if Numbers is not empty is done*/
@Transactional
public class ContentDaoImpl extends HibernateDaoSupport{

    public void setNumber(String urlName) {
        
        if(checkTable(urlName) == true) {
            
            Query deleteQuery = getSessionFactory().getCurrentSession().createSQLQuery("Delete from numbers where urlName=:urlName")
                    .setParameter("urlName", urlName);
            deleteQuery.executeUpdate();
            
            insertTable(urlName);
        }
        else {
            insertTable(urlName);
        }
      
    }
    
    public boolean checkTable(String urlName) {
        Query checkkQuery = getSessionFactory().getCurrentSession().createQuery("from Numbers where urlName=:urlName",Numbers.class)
                .setParameter("urlName", urlName);
        
        if(checkkQuery.list().size() > 0) {
            return true;
        }
        return false;
    }
    
    public void insertTable(String urlName) {
        Query insertQuery = getSessionFactory().getCurrentSession().createSQLQuery("Insert into numbers(urlName) values(:urlName)")
                .setParameter("urlName", urlName);
        insertQuery .executeUpdate();
    }

    public Numbers getNumbers(String urlName) {
        Query checkkQuery = getSessionFactory().getCurrentSession().createQuery("from Numbers where urlName=:urlName",Numbers.class)
                .setParameter("urlName", urlName);
        if(checkkQuery.list().size() >0) {            
            Numbers number =  (Numbers) checkkQuery.list().get(0);
            return number;
        }
        return null;
    }
}
