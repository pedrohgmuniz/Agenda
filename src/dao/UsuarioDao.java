package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDao {
	
	public void inserir(Usuario obj);
	public void alterar(Usuario obj);
	public void excluir(Usuario obj);
	public List<Usuario> listar(Usuario obj);

}
