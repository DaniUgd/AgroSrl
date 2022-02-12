/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;


import Clases.Campo;
import Clases.Laboreo;
import Controladora.HibernateSession;
import interDao.LaboreoDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel
 */
public class Laboreoimpl implements LaboreoDao {
private Session session;

    @Override
    public void insertar(Laboreo g) {
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
    public void modificar(Laboreo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Laboreo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboreo> obtenerTodos() {
       Transaction tr= null;
        List <Laboreo> mostrar = null;

                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    mostrar= session.createCriteria(Laboreo.class).list();
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
    public Laboreo obtener(Long id) {
       Laboreo retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                retorno = (Laboreo) session.get(Laboreo.class, id);
                session.close();
            } catch (NullPointerException e){
                System.out.println("Falló");
                  e.printStackTrace();
                     session.getTransaction().rollback();
            }
            
            return retorno;
    }
    
    


}
