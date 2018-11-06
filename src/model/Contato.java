package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Contato")
@Table(name="TABELA_CONTATO")
public class Contato implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idContato;
	
	@Column(name="NOME_CONTATO", nullable=false, unique=true)
	private String nomeContato;
	
	@Column(name="ENDERECO_CONTATO", nullable=false, unique=false)
	private String enderecoContato;
	
	@Column(name="TELEFONE_CONTATO", nullable=false, unique=true)
	private int telefoneContato;
	
	@Column(name="EMAIL_CONTATO", nullable=false, unique=true)
	private String emailContato;
	
	@Column(name="SEXO_CONTATO", nullable=false, unique=false)
	private String sexoContato;

	
	// GETTERS & SETTERS
	public Long getIdContato() {
		return idContato;
	}
	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getEnderecoContato() {
		return enderecoContato;
	}
	public void setEnderecoContato(String enderecoContato) {
		this.enderecoContato = enderecoContato;
	}
	public int getTelefoneContato() {
		return telefoneContato;
	}
	public int setTelefoneContato(int telefoneContato) {
		return this.telefoneContato = telefoneContato;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String getSexoContato() {
		return sexoContato;
	}
	public void setSexoContato(String sexoContato) {
		this.sexoContato = sexoContato;
	}

}
