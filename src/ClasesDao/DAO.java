


 package ClasesDao;

import java.util.List;

 
public interface DAO <T , K> {
	void insertar(T g);
	void modificar(T g);
	void eliminar(T g);
	List<T> obtenerTodos();
	T obtener(K id);
}
