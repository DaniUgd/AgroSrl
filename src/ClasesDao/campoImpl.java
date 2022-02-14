/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Campo;
import Controladora.HibernateSession;
import interDao.CampoDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


public class campoImpl implements CampoDao{
private Session session;
Campo campo;
    public campoImpl() {
    }

    @Override
    public void insertar(Campo g) {
        try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.save(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
            session.getTransaction().rollback();
          }
		
   }

    @Override
    public void modificar(Campo g) {
       try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.update(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
            session.getTransaction().rollback();
            
        }
    }

    @Override
    public void eliminar(Campo g) {
        try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.delete(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
            session.getTransaction().rollback();
        }	
	
    }

    @Override
    public List<Campo> obtenerTodos() {
     
        Transaction tr= null;
        List <Campo> mostrar = null;

                try {
                    
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(5);
                    mostrar= session.createCriteria(Campo.class).list();
                    System.out.println(mostrar);
                    for(Object obj :mostrar ){
                        System.out.println(obj.toString());
                    
                    }
                     session.getTransaction().commit();
                     session.close();
                }
                
                catch (Exception e) {
                     e.printStackTrace();
                    session.getTransaction().rollback();
                }
                return mostrar;
        }

    @Override
    public Campo obtener(Long id) {
        Campo retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                retorno = (Campo) session.get(Campo.class, id);
                session.close();
            } catch (NullPointerException e){
                System.out.println("Falló");
                  e.printStackTrace();
                     session.getTransaction().rollback();
                
            }
            return retorno;
    }
        
    }

  

    

    
    
    
    

