package aplication.interfaces;

import java.util.Scanner;

import Dominio.Usuario;
import aplication.MenuFactory;
import aplication.implementacoes.IdiomaImplementacao;
import service.UsuarioService;

public class MenuLogin implements Menu {
	private UsuarioService service;

	public MenuLogin(){
		this.service = new UsuarioService();
	}
	
	@Override
	public Menu chamarMenu(IdiomaImplementacao idiomaImplementacao, Scanner input) {
		Usuario usuarioParaLogar = idiomaImplementacao.mostrarMenuLogin(input);
		boolean retornoVerificado = service.verificarLogin(usuarioParaLogar);
		
		return tratarAçãoUsuario(retornoVerificado);
	}

	@Override
	public Menu devolverOpcaoEscolhida(int opcao) {
		return switch (opcao) {
		case 1 -> MenuFactory.pegarMenu(TipoMenu.CERTO, TipoMenu.GERAL);
		case 2 -> MenuFactory.pegarMenu(TipoMenu.FALHA, TipoMenu.INICIO);
		default -> MenuFactory.pegarMenu(TipoMenu.LOGIN);
		};
	}
	
	public Menu tratarAçãoUsuario(boolean verificacao) {
		if(verificacao) {
			return MenuFactory.pegarMenu(TipoMenu.CERTO, TipoMenu.GERAL, "   LOGIN CONCLUIDO COM SUCESSO");
		} else {
			return MenuFactory.pegarMenu(TipoMenu.FALHA, TipoMenu.INICIO,"   LOGIN NÃO CONCLUIDO");
		}
	}

}
