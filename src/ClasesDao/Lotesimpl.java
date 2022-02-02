/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Campo;
import Clases.Lotes;
import Controladora.HibernateSession;
import interDao.LotesDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ezest
 */
public class Lotesimpl implements LotesDao {
private Session session;
    @Override
    public void insertar(Lotes g) {
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
    public void modificar(Lotes g) {
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
    public void eliminar(Lotes g) {
        
    }

    @Override
    public List<Lotes> obtenerTodos() {
        
         Transaction tr= null;
        List <Lotes> mostrar = null;

                try {
                    
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(5);
                    mostrar= session.createCriteria(Lotes.class).list();
                    System.out.println(mostrar);
                    for(Object obj :mostrar ){
                        System.out.println(obj.toString());
                    
                    }
                     session.getTransaction().commit();
                }
                
                catch (Exception e) {
                     e.printStackTrace();
                    // session.getTransaction().rollback();
                }
                return mostrar;
        
        
      
        
        
    }

    @Override
    public Lotes obtener(Long id) {
    return null;
        
    }
    
}
