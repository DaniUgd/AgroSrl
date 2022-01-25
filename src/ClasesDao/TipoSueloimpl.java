
package ClasesDao;

import Clases.EstadoCampo;
import Clases.TipoSuelo;
import Controladora.HibernateSession;
import interDao.TipoSueloDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ezest
 */
public class TipoSueloimpl implements TipoSueloDao{
private Session session=null;
    @Override
    public void insertar(TipoSuelo g) {
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
    public void modificar(TipoSuelo g) {
        
    }

    @Override
    public void eliminar(TipoSuelo g) {
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
        }	
    }

    @Override
    public List<TipoSuelo> obtenerTodos() {
        List <TipoSuelo> suelos = null;
                try {
            session = null;
            session= HibernateSession.getSession();
                    Query  q = session.createQuery("SELECT t FROM TipoSuelo t");
                    
                    suelos= q.list();
                } catch (Exception e) {
                }
              
		return suelos;
        
    }

    @Override
    public TipoSuelo obtener(Long id) {
        return null;
        
    }
    
}
