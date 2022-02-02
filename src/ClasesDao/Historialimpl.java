/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Historial;
import Controladora.HibernateSession;
import interDao.HistorialDao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Daniel
 */
public class Historialimpl implements HistorialDao {
private Session session=null;
    @Override
    public void insertar(Historial g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Historial g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Historial g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Historial> obtenerTodos() {
        
      List <Historial> historial = null;
                try {
            session = null;
            session= HibernateSession.getSession();
                    Query  q = session.createQuery("SELECT t FROM proyectolote t");
                    
                    historial= q.list();
                } catch (Exception e) {
                }
              
		return historial;
    }

    @Override
    public Historial obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
