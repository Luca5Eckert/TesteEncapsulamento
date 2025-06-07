package aplication.interfaces;

import aplication.implementacoes.IdiomaImplementacao;
import java.util.Scanner;

public class MenuFalha implements Menu {
	private Menu proximoMenu;
	private String mensagemErro = " Não foi possivel realizar tal ação";
	
	public MenuFalha(Menu proximoMenu, String mensagemErro) {
		this.proximoMenu = proximoMenu;
		this.mensagemErro = mensagemErro;
	}
	
	
	@Override
	public Menu chamarMenu(IdiomaImplementacao idiomaImplementacao, Scanner input) {
		int opcao = 0;
		opcao = idiomaImplementacao.mostrarMenuErro(input, mensagemErro);
		
		return devolverOpcaoEscolhida(opcao);
	}

	@Override
	public Menu devolverOpcaoEscolhida(int opcao) {
		return switch(opcao) {
		case 1 -> this.proximoMenu;
		default -> this.proximoMenu;
		};
	}
	

}
