/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDao;

import Clases.Lotes;
import Controladora.HibernateSession;
import interDao.LotesDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

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
        
    }

    @Override
    public void eliminar(Lotes g) {
        
    }

    @Override
    public List<Lotes> obtenerTodos() {
        return null;
      
    }

    @Override
    public Lotes obtener(Long id) {
    return null;
        
    }
    
}
