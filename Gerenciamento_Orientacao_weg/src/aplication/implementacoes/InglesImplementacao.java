package aplication.implementacoes;

import java.util.Scanner;

import Dominio.Orientacao;
import Dominio.Usuario;

public class InglesImplementacao implements IdiomaImplementacao {

	@Override
	public int mostrarMenuInicial(Scanner input) {
		System.out.println("================================================================");
		System.out.println("                              HOME                              ");
		System.out.println("================================================================");
		System.out.println(" Welcome to the Guidance Manager System: \n");
		
		System.out.println(" 1- Login");
		System.out.println(" 2- Registration");
		System.out.println(" 3- Exit system\n");
		
		System.out.println("----------------------------------------------------------------");
		return 0;
	}

	@Override
	public Usuario mostrarMenuLogin(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario mostrarMenuCadastro(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int mostrarMenuGeral(Scanner input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mostrarMenuOpcoesOrientacao(Scanner input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orientacao mostrarMenuCriarOrientacao(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orientacao mostrarMenuEditarOrientacao(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orientacao mostrarMenuOrientacaoDisponiveis(Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int mostrarMenuErro(Scanner input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mostrarMenuAcerto(Scanner input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orientacao mostrarMenuEditarOrientacao(Orientacao orientacao, Scanner input) {
		// TODO Auto-generated method stub
		return null;
	}


}
