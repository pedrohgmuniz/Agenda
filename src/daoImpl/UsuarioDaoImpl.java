package daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import controller.ResourcePersistence;
import dao.UsuarioDao;
import model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	@Override
	public void inserir(Usuario obj) {
		EntityManager em = ResourcePersistence.getEntityManager();
		try {
			
		} catch (Exception e) {
			System.err.println("Erro " + e.getMessage());
		}
		
	}

	@Override
	public void alterar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listar(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
