package daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Contato;
import controller.ResourcePersistence;
import dao.ContatoDao;

public class ContatoDaoImpl implements ContatoDao {

	@Override
	public void inserir(Contato obj) {
		EntityManager em = ResourcePersistence.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			System.out.println("Registro inserido com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro " + e.getMessage());
		} finally {
			em.close();
		}
		
	}

	@Override
	public void alterar(Contato obj) {
		EntityManager em = ResourcePersistence.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			System.out.println("Registro alterado com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro " + e.getMessage());
		} finally {
			em.close();
		}
		
	}

	@Override
	public void excluir(Contato obj) {
		EntityManager em = ResourcePersistence.getEntityManager();
		try {
			em.getTransaction().begin();
			Contato contato = em.find(Contato.class, obj.getIdContato());
			em.remove(contato);
			em.getTransaction().commit();
			System.out.println("Registro excluído com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro " + e.getMessage());
		} finally {
			em.close();
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar(Contato obj) {
		EntityManager em = ResourcePersistence.getEntityManager();
		List<Contato> lista = new ArrayList<Contato>();
		try {
			em.getTransaction().begin();
			lista = em.createQuery("SELECT c from Contato c ").getResultList();
			em.getTransaction().commit(); // A rigor, esta linha não é necessária.
			return lista;
		} catch (Exception e) {
			System.err.println("Erro" + e.getMessage());
		} finally {
			em.close();
		}
		return lista;
	}
	
	

}
