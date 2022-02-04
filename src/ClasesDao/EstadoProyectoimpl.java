/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.EstadoProyecto;
import Clases.Laboreo;
import Controladora.HibernateSession;
import interDao.EstadoProyectoDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class EstadoProyectoimpl implements EstadoProyectoDao {
private Session session;
    @Override
    public void insertar(EstadoProyecto g) {
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
    public void modificar(EstadoProyecto g) {
    }

    @Override
    public void eliminar(EstadoProyecto g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstadoProyecto> obtenerTodos() {
            Transaction tr= null;
        List <EstadoProyecto> mostrar = null;

                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    mostrar= session.createCriteria(EstadoProyecto.class).list();
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
    public EstadoProyecto obtener(Long id) {
                   EstadoProyecto retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                retorno = (EstadoProyecto) session.get(EstadoProyecto.class, id);
                
            } catch (NullPointerException e){
                System.out.println("Falló");
                  e.printStackTrace();
                     session.getTransaction().rollback();
            }
            
            return retorno;



    }
    
}
