package aplication;

import aplication.interfaces.*;
import service.OrientacaoService;
import service.UsuarioService;

public class MenuFactory {
	
	public static Menu pegarMenu(TipoMenu tipoMenu) {
		return switch(tipoMenu){
		case TipoMenu.INICIO -> new MenuInicial();
		case TipoMenu.CADASTRO -> new MenuCadastro(new UsuarioService());
		case TipoMenu.LOGIN -> new MenuLogin();
		case TipoMenu.FIM -> new MenuFinal();
		case TipoMenu.GERAL -> new MenuGeral();
		case TipoMenu.PESQUISA_ORIENTACAO -> new MenuPesquisaOrientacao();
		case TipoMenu.ADICAO_ORIENTACAO -> new MenuAdicaoOrientacao();
		case TipoMenu.EXIBIR_ORIENTACOES -> new MenuExibirOrientacoes();
		default -> new MenuInicial();
		}; 
	}
	

	
	public static Menu pegarMenu(TipoMenu tipoMenu, Menu proximoMenu, String mensagem) {
		return switch(tipoMenu) {
		case TipoMenu.CERTO -> new MenuCerto(proximoMenu, mensagem);
		case TipoMenu.FALHA -> new MenuFalha(proximoMenu, mensagem);
		default -> new MenuInicial();
		};
		
	}
	
}
