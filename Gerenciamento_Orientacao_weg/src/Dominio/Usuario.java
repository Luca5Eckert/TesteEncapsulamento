package Dominio;

import java.util.Objects;

public class Usuario {
	private String nome;
	private String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Usuario outro = (Usuario) obj;
	    return this.nome.equalsIgnoreCase(outro.nome);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(nome.toLowerCase());
	}
	
	
}
