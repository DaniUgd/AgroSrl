/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Campo;
import Clases.Proyecto;
import Controladora.HibernateSession;
import interDao.ProyectoDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel
 */
public class Proyectoimpl implements ProyectoDao {
    private Session session;
    @Override
    public void insertar(Proyecto g) {
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
        }	
    }

    @Override
    public void modificar(Proyecto g) {
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
        }
    }

    @Override
    public void eliminar(Proyecto g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proyecto> obtenerTodos() {
         Transaction tr= null;
        List <Proyecto> mostrar = null;

                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    mostrar= session.createCriteria(Proyecto.class).list();
                    System.out.println(mostrar);
                    
                    for(Object obj :mostrar ){
                        System.out.println(obj.toString());
                    
                    }
                     session.getTransaction().commit();
                
                }
                
                catch (Exception e) {
                    e.printStackTrace();
                     session.getTransaction().rollback();
                }
                return mostrar;
    }

    @Override
    public Proyecto obtener(Long id) {
        Proyecto retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                retorno = (Proyecto) session.get(Proyecto.class, id);
              
            } catch (NullPointerException e){
                System.out.println("Falló");
                  e.printStackTrace();
                     session.getTransaction().rollback();
            }
            return retorno;
    }
   }
    

