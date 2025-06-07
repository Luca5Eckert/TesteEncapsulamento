package aplication.implementacoes;

import java.util.Scanner;

import Dominio.Orientacao;
import Dominio.TipoOrientacao;
import Dominio.Usuario;
import aplication.interfaces.TipoMenu;

public class PortuguesImplementacao implements IdiomaImplementacao {
	
	@Override
	public int mostrarMenuInicial(Scanner input) {
		System.out.println("============================================================");
		System.out.println("                        INICIO                              ");
		System.out.println("============================================================");
		System.out.println(" Bem vindo ao sistema de gerenciador de Orientações:        ");

		System.out.println(" 1- Login");
		System.out.println(" 2- Cadastro");
		System.out.println(" 3- Sair sistema");

		System.out.println("------------------------------------------------------------");

		return input.nextInt();
	}

	@Override
	public Usuario mostrarMenuLogin(Scanner input) {
		input.nextLine();
		System.out.println("============================================================");
		System.out.println("                        LOGIN                               ");
		System.out.println("============================================================");
		System.out.println(" Insira seus dados:\n");

		System.out.println(" 1- Nome:");
		String nome = input.nextLine();

		System.out.println(" 2- Senha:");
		String senha = input.nextLine();

		System.out.println("------------------------------------------------------------");
		return new Usuario(nome, senha);
	}

	@Override
	public Usuario mostrarMenuCadastro(Scanner input) {
		input.nextLine();
		System.out.println("============================================================");
		System.out.println("                      CADASTRO                              ");
		System.out.println("============================================================");
		System.out.println(" Insira seus dados:\n");

		System.out.println(" 1- Nome:");
		String nome = input.nextLine();

		System.out.println(" 2- Senha:");
		String senha = input.nextLine();

		System.out.println("------------------------------------------------------------");
		return new Usuario(nome, senha);
	}

	@Override
	public int mostrarMenuGeral(Scanner input) {
		input.nextLine();
		System.out.println("============================================================");
		System.out.println("                     GERENCIADOR                            ");
		System.out.println("============================================================");

		System.out.println(" 1- Criar Orientação:");
		System.out.println(" 2- Visualizar Orientações");
		System.out.println(" 3- Pesquisar Orientação");
		System.out.println(" 4- Deletar Orientação");
		System.out.println(" 5- Sair Gerenciador");

		System.out.println("------------------------------------------------------------");

		int numeroRetorno = input.nextInt();

		return numeroRetorno;
	}

	@Override
	public Orientacao mostrarMenuCriarOrientacao(Scanner input) {
		input.nextLine();
		System.out.println("============================================================");
		System.out.println("                       CRIAÇÃO                              ");
		System.out.println("============================================================");

		System.out.println(" Título orientação:");
		String tituloOrientacao = input.nextLine();

		System.out.println(" Tipo Orienteção: ");
		TipoOrientacao tipoOrientacao = TipoOrientacao.pegarOrientacao(input.nextInt());

		System.out.println(" Conteúdo Português: ");
		String conteudoPortugues = input.nextLine();

		System.out.println(" Conteúdo Inglês: ");
		String conteudoIngles = input.nextLine();

		System.out.println(" Conteúdo Alemão: ");
		String conteudoAlemao = input.nextLine();

		System.out.println(" Conteúdo Espanhol: ");
		String conteudoEspanhol = input.nextLine();

		System.out.println("------------------------------------------------------------");
		
		return new Orientacao(tituloOrientacao, tipoOrientacao, conteudoPortugues, conteudoIngles, conteudoAlemao,
				conteudoEspanhol);
	}

	@Override
	public Orientacao mostrarMenuEditarOrientacao(Orientacao orientacao, Scanner input) {
		boolean edicaoMenu = true;
		
		do {
			System.out.println("============================================================");
			System.out.println("                        EDIÇÃO                              ");
			System.out.println("============================================================");
			System.out.println(" Selecione o que deseja alterar: \n");
			
			System.out.println(" 1- Título da orientação");
			System.out.println(" 2- Tipo de Orienteção");
			System.out.println(" 3- Conteúdo Português");
			System.out.println(" 4- Conteúdo Inglês");
			System.out.println(" 5- Conteúdo Alemão");
			System.out.println(" 6- Conteúdo Espanhol");
			
			System.out.println(" 0- Sair edição");

			System.out.println("------------------------------------------------------------");
			
			int numeroRetorno = input.nextInt();
			
			input.nextLine();
			
			switch(numeroRetorno) {
			case 1:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo titulo: ");
				orientacao.setTitulo(input.nextLine());
				System.out.println("------------------------------------------------------------");
				break;
			case 2:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo tipo orientação: ");
				orientacao.setTipo(TipoOrientacao.pegarOrientacao(input.nextInt()));
				System.out.println("------------------------------------------------------------");
				break;
			case 3:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo conteudo portugues: ");
				orientacao.setConteudoPortugues(input.nextLine());
				System.out.println("------------------------------------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo conteudo Ingles: ");
				orientacao.setConteudoIngles(input.nextLine());
				System.out.println("------------------------------------------------------------");
				break;
			case 5:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo conteudo alemão: ");
				orientacao.setConteudoAlemao(input.nextLine());
				System.out.println("------------------------------------------------------------");
				break;
			case 6:
				System.out.println("------------------------------------------------------------");
				System.out.print  (" Novo conteudo Espanhol: ");
				orientacao.setConteudoEspanhol(input.nextLine());
				System.out.println("------------------------------------------------------------");
				break;
				default:
					edicaoMenu = false;
					return orientacao;
			}
			
		} while( edicaoMenu );
		
		return orientacao;

	}

	@Override
	public Orientacao mostrarMenuOrientacaoDisponiveis(Scanner input) {
		return null;
	}

	@Override
	public int mostrarMenuOpcoesOrientacao(Scanner input) {
		return 0;
	}

	@Override
	public Orientacao mostrarMenuEditarOrientacao(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int mostrarMenuAcerto(Scanner input, String mensagemAcerto) {
		System.out.println("------------------------------------------------------------");		
		System.out.println(mensagemAcerto);
		System.out.println(" 1 - Continuar ");
		System.out.println("------------------------------------------------------------");		
		return input.nextInt();
	}

	@Override
	public int mostrarMenuErro(Scanner input, String mensagemErro) {
		System.out.println("------------------------------------------------------------");		
		System.out.println("                           ERRO                             ");
		System.out.println(mensagemErro);
		System.out.println(" 1 - Continuar ");
		System.out.println("------------------------------------------------------------");	
		return 0;
	}

}
