package com.mikke.shoppstat.DAO;

import com.mikke.shoppstat.entities.Person;
import com.mikke.shoppstat.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDAO {

    private Session sesion;
    private Transaction tx;

    private void initOperation() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        //tx = sesion.beginTransaction();
        sesion.getTransaction().begin();
    }

    protected void endOperacion()
    {
        sesion.getTransaction().commit();
        sesion.close();
    }

    private void managerExcepcion(HibernateException he) throws HibernateException {
        //tx.setRollbackOnly();
        sesion.getTransaction().rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    protected Session getSession()
    {
        return sesion;
    }

    public Long addUser (Person user){
        long id = 0;

        try
        {
            initOperation();
            id = (Long)getSession().save(user);
            getSession().flush();
            //tx.commit();
        }catch(HibernateException he)
        {
            managerExcepcion(he);
            throw he;
        }finally
        {
            //sesion.close();
           endOperacion();
        }
        return id;
    }

    public void updateUser (Person user) throws HibernateException{
        try
        {
            initOperation();
            getSession().update(user);
            //tx.commit();
            getSession().flush();
        }catch (HibernateException he)
        {
            managerExcepcion(he);
            throw he;
        }finally
        {
            //sesion.close();
            endOperacion();
        }
    }

    public void deleteUser(Person user) throws HibernateException {
        try
        {
            initOperation();
            getSession().delete(user);
            //tx.commit();
            getSession().flush();
        } catch (HibernateException he)
        {
            managerExcepcion(he);
            throw he;
        }finally
        {
            //sesion.close();
            endOperacion();
        }
    }

    public Person getUser(long userId) throws HibernateException {
        Person user = null;

        try
        {
            initOperation();
            user = (Person) getSession().get(Person.class, userId);
        } finally
        {
            //sesion.close();
            endOperacion();
        }
        return user;
    }

    public List<Person> getAllUsers() throws HibernateException {
        List<Person> userList = null;

        try
        {
            initOperation();
            //Crear las query en el hbm o simplemente las complejas que se usan el Facade de MDM-BBR
            userList = getSession().createQuery("from Person ").list();
        }finally
        {
            //sesion.close();
            endOperacion();
        }

        return userList;
    }
}
