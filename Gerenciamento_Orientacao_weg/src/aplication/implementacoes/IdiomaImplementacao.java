package aplication.implementacoes;
import java.util.Scanner;

import Dominio.Orientacao;
import Dominio.Usuario;

public interface IdiomaImplementacao {
	
	public int mostrarMenuInicial(Scanner input);
	
	public Usuario mostrarMenuLogin(Scanner input);
	
	public Usuario mostrarMenuCadastro(Scanner input);
	
	public int mostrarMenuGeral(Scanner input);
	
	public int mostrarMenuOpcoesOrientacao(Scanner input);
	
	public Orientacao mostrarMenuCriarOrientacao(Scanner input);
	
	public Orientacao mostrarMenuEditarOrientacao(Scanner input);
	
	public Orientacao mostrarMenuOrientacaoDisponiveis(Scanner input);
	
	public int mostrarMenuErro(Scanner input, String mensagemErro);
	
	public int mostrarMenuAcerto(Scanner input, String mensagemAcerto);

	Orientacao mostrarMenuEditarOrientacao(Orientacao orientacao, Scanner input);
	
}
