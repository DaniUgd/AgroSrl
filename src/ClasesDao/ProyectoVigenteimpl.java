/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.EstadoCampo;
import Clases.Lotes;
import Clases.Proyecto;
import Clases.ProyectoVigente;
import Clases.TipoSuelo;
import Controladora.HibernateSession;
import interDao.ProyectoVigenteDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.query.Query;

/**
 *
 * @author Daniel
 */
public class ProyectoVigenteimpl implements ProyectoVigenteDao {
private Session session=null;

    @Override
    public void insertar(ProyectoVigente g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(ProyectoVigente g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarPV(ProyectoVigente g) {
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
    
    public ProyectoVigente BuscarIdPV(Long idP,Long idL) {
        Transaction tr= null;
        ProyectoVigente retorno = null;
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
    public List<ProyectoVigente> obtenerTodos() {
        
            session = null;
            session= HibernateSession.getSession();
               /* try {
            
                    Query  q = session.createQuery("FROM ProyectoVigente");
                    
                    prov= q.list();
                    System.out.println("Aca esta prov desde la impl"+prov.toString());
                   session.close();
                } catch (Exception e) {
                }
                
		return prov;*/
        
               List<ProyectoVigente> prov = session.createQuery(
                "SELECT ph from ProyectoVigente ph WHERE ph.idLote = : elt2" )
               .setParameter( "elt2", (long)5 )
               .list();
                
               System.out.println("esto es obtener todos de prov"+prov);
               return prov;
               
               
               
    }

    @Override
    public ProyectoVigente obtener(Long id) {
        
        return null;
        
    }

    @Override
    public void eliminar(ProyectoVigente g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
