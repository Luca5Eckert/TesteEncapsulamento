package aplication.interfaces;

import Dominio.Usuario;
import aplication.MenuFactory;
import aplication.implementacoes.IdiomaImplementacao;
import java.util.Scanner;
import service.UsuarioService;

public class MenuCadastro implements Menu {
	private UsuarioService usuarioService;
	
	public MenuCadastro(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@Override
	public Menu chamarMenu(IdiomaImplementacao idiomaImplementacao, Scanner input) {
		int opcao = 0;
		String mensagemDeErro;
		
	}

	@Override
	public Menu devolverOpcaoEscolhida(int opcao) {
		return switch (opcao) {
		case 0 -> MenuFactory.pegarMenu(TipoMenu.FALHA,TipoMenu.GERAL);
		case 1 -> MenuFactory.pegarMenu(TipoMenu.CERTO,TipoMenu.GERAL);
		default -> MenuFactory.pegarMenu(TipoMenu.CADASTRO);
		};
	}

}
