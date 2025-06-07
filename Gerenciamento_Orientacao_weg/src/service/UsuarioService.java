package service;

import Dominio.Usuario;
import repositorio.UsuarioRepositorio;

public class UsuarioService {
	private UsuarioRepositorio repositorio;

	public UsuarioService() {
		this.repositorio = new UsuarioRepositorio();
	}

	public boolean verificarLogin(Usuario usuario) {
		return repositorio.verificarSeUsuarioExiste(usuario);
	}
	
	public int verificarCadastro(Usuario usuario) {
		boolean retorno =  !(repositorio.verificarSeUsuarioExiste(usuario));
		
		if(retorno) {
			return 1;
		} else {
			return 0;
		}
	}

}
