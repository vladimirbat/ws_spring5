package persistencia;

import java.util.List;

import entities.ClienteEntity;
import excepciones.BbddException;
import excepciones.ClienteNoExisteException;
import excepciones.ClienteYaExisteException;

public interface BancoDaoInterface 
{
	public int cambiarSaldo(long dni, double incrementoSaldo);
	public List<ClienteEntity> buscarPorApellidos(String apellidos) throws BbddException;
	public ClienteEntity buscarPorDni(long dni) throws ClienteNoExisteException, BbddException;
	public void borrar(long dni)throws ClienteNoExisteException, BbddException;
	public void insertar(ClienteEntity cliente)throws ClienteYaExisteException, BbddException;
	public void actualizar(ClienteEntity cliente)throws ClienteNoExisteException, BbddException;
	
}
