package dao;

import java.util.List;

import model.Contato;

public interface ContatoDao {
	
	public void inserir(Contato obj);
	public void alterar(Contato obj);
	public void excluir(Contato obj);
	public List<Contato> listar(Contato obj);

}
