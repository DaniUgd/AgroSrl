/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.EstadoCampo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import Controladora.HibernateSession;
/**
 *
 * @author ezest
 */
public class EstadoCampoimpl implements DAO {
private Session session=null;
    @Override
    public void insertar(Object g) {
       
    }

    @Override
    public void modificar(Object g) {
        
    }

    @Override
    public void eliminar(Object g) {
        
    }

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
    public Object obtener(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
