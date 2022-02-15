/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.EstadoCampo;
import Clases.Lotes;
import Clases.Proyecto;
import Clases.Historial;
import Clases.TipoSuelo;
import Controladora.HibernateSession;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.query.Query;
import interDao.HistorialDao;

/**
 *
 * @author Daniel
 */
public class Historialimpl implements HistorialDao {
private Session session=null;

    @Override
    public void insertar(Historial g) {
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
    public void modificar(Historial g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarPV(Historial g) {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.delete(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
           
        
        
        /*Transaction tr= null;
     
        session= HibernateSession.getSession();
        tr=session.beginTransaction();
        tr.setTimeout(2);
        String hql = "Delete FROM ProyectoVigente Where idProyecto=:idP and idLote=: idL" ;   
        Query q = this.session.createQuery(hql) ;   
        q.setLong("idP",idP);   
        q.setLong("idL", idL);  
        q.executeUpdate();   
        session.getTransaction().commit();
        session.close();*/
        
        
        
        
        
     } 
    
    public Historial BuscarIdPV(Long idP,Long idL) {
        Transaction tr= null;
        Historial retorno = null;
        session= HibernateSession.getSession();
        tr=session.beginTransaction();
        tr.setTimeout(2);
       /* String hql = "Select t FROM  ProyectoVigente t Where idProyecto=:"+idP+" and idLote=:"+idL;   
        Query q = this.session.createQuery(hql);*/
        org.hibernate.query.Query query =
        session.createQuery("Select t FROM  ProyectoVigente t Where idProyecto=:"+idP+" and idLote=:"+idL ).setParameter( "idP", "idL");
        /*q.setLong("idP", idP);   
        q.setLong("idL", idL);*/
       // retorno=(ProyectoVigente) q.list();
        session.getTransaction().commit();
        session.close();
        System.out.println("ACA ESTA RETORNO"+retorno.toString());
       return retorno;
     } 
                
	
	
        
        
    

    @Override
    public List<Historial> obtenerTodos() {
        
          Transaction tr= null;
        List <Historial> mostrar = null;

                try {
                    
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(5);
                    mostrar= session.createCriteria(Historial.class).list();
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
    public Historial obtener(Long id) {
        
        return null;
        
    }

    @Override
    public void eliminar(Historial g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
