package aplication.interfaces;

import Dominio.Orientacao;
import Dominio.TipoOrientacao;
import aplication.MenuFactory;
import aplication.implementacoes.IdiomaImplementacao;
import service.OrientacaoService;
import java.util.Scanner;

public class MenuEdicao implements Menu {
	private OrientacaoService service;
	private Orientacao orientacao;

	public MenuEdicao( Orientacao orientacao) {
		this.service = new OrientacaoService();
		this.orientacao = orientacao;
	}
	
	

	@SuppressWarnings("finally")
	public Menu chamarMenu(IdiomaImplementacao idiomaImplementacao, Scanner input) {
		int opcao = 1;
		try {
			idiomaImplementacao.mostrarMenuEditarOrientacao(orientacao, input);
			this.service.atualizarOrientacao(orientacao);
			
		} catch (Exception e ) {
			opcao = 0;
		} finally {
			return devolverOpcaoEscolhida(opcao);			
		}
	}

	@Override
	public Menu devolverOpcaoEscolhida(int opcao) {
		return switch(opcao) {
		case 0 -> MenuFactory.pegarMenu(TipoMenu.FALHA, TipoMenu.GERAL);
		case 1 -> MenuFactory.pegarMenu(TipoMenu.CERTO, TipoMenu.GERAL);
		default -> MenuFactory.pegarMenu(TipoMenu.GERAL);
		};
	}

	

}
