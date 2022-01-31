/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Campo;
import Clases.EstadoCampo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import Controladora.HibernateSession;
import interDao.EstadoCampoDao;
/**
 *
 * @author ezest
 */
public class EstadoCampoimpl implements EstadoCampoDao {
private Session session=null;





    @Override
    public List<EstadoCampo> obtenerTodos() {
        List <EstadoCampo> estados = null;
                try {
            session = null;
            session= HibernateSession.getSession();
                    Query  q = session.createQuery("SELECT e FROM EstadoCampo e");
                    
                    estados= q.list();
                } catch (Exception e) {
                }
                System.out.println(estados);
		return estados;
    }

    @Override
    public void insertar(EstadoCampo g) {
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
    public void modificar(EstadoCampo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(EstadoCampo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoCampo obtener(Long id) {
         EstadoCampo retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                retorno = (EstadoCampo) session.get(EstadoCampo.class, id);
                
            } catch (NullPointerException e){
                System.out.println("Falló");
            }
            return retorno;
    }
    
}
