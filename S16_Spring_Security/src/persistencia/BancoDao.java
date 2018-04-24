package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.ClienteEntity;
import excepciones.BbddException;
import excepciones.ClienteConRegistrosException;
import excepciones.ClienteNoExisteException;
import excepciones.ClienteSinSaldoException;
import excepciones.ClienteYaExisteException;
//@Component
@Repository //Para que funcione la translación de excepciones de JPA a Spring
public class BancoDao implements BancoDaoInterface 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public int cambiarSaldo(long dni, double incrementoSaldo) 
	{
			ClienteEntity cliente = entityManager.find(ClienteEntity.class, dni);
			if(cliente==null) return 0;
			cliente.setSaldo(cliente.getSaldo() + incrementoSaldo);
			entityManager.flush();
			if(cliente.getSaldo()<0) throw new ClienteSinSaldoException();
			return 1;
	}

	@Override
	@Transactional(readOnly=true)
	public List<ClienteEntity> buscarPorApellidos(String apellidos)
			throws BbddException {
		String jpql = "select b from ClienteEntity b where" +
				" b.apellidos like :ape";
		List<ClienteEntity> clientes = null;
		clientes = entityManager.createQuery(jpql,ClienteEntity.class)
					.setParameter("ape", "%" + apellidos + "%")
					.getResultList();
		return clientes;
	}

	@Override
	@Transactional
	public ClienteEntity buscarPorDni(long dni) throws ClienteNoExisteException,
			BbddException {
		ClienteEntity c = null;
		c = entityManager.find(ClienteEntity.class, dni);
		if(c==null)
			throw new ClienteNoExisteException();
		return c;
	}

	@Override
	@Transactional
	public void borrar(long dni) throws ClienteNoExisteException, BbddException {
		ClienteEntity c = null;
		c = entityManager.find(ClienteEntity.class, dni);
		if(c==null)
		{
			throw new ClienteNoExisteException();
		}
		entityManager.remove(c);
		entityManager.flush();
	}

	@Override
	@Transactional
	public void insertar(ClienteEntity cliente)
			throws ClienteYaExisteException, BbddException {
			entityManager.persist(cliente);
			entityManager.flush();
	}

	@Override
	@Transactional
	public void actualizar(ClienteEntity cliente)
			throws ClienteNoExisteException, BbddException {
		ClienteEntity c = null;
		c = entityManager.find(ClienteEntity.class, cliente.getDni());
		if(c==null)
		{
			throw new ClienteNoExisteException();
		}
		entityManager.merge(cliente);
		entityManager.flush();
	}
	
}















