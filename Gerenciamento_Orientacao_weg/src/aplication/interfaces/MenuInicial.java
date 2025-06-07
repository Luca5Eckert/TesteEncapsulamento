package aplication.interfaces;

import java.util.Scanner;

import aplication.MenuFactory;
import aplication.implementacoes.IdiomaImplementacao;

public class MenuInicial implements Menu{
	
	public MenuInicial() {
	}
	
	@Override
	public Menu chamarMenu(IdiomaImplementacao idiomaImplementacao, Scanner input) {
		int opcaoEscolhida = 0;
		opcaoEscolhida = idiomaImplementacao.mostrarMenuInicial(input);
		
		return devolverOpcaoEscolhida(opcaoEscolhida);
	}

	@Override
	public Menu devolverOpcaoEscolhida(int opcao) {
		return switch(opcao) {
		case 1 -> MenuFactory.pegarMenu(TipoMenu.LOGIN);
		case 2 -> MenuFactory.pegarMenu(TipoMenu.CADASTRO);
		case 3 -> MenuFactory.pegarMenu(TipoMenu.FIM);
		default -> MenuFactory.pegarMenu(TipoMenu.INICIO);
		};
	}

	

}
