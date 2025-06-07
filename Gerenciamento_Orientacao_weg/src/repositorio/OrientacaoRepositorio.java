package repositorio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Orientacao;

public class OrientacaoRepositorio {
	private static final List<Orientacao> orietacaoRepositorio = new ArrayList<Orientacao>();

	public OrientacaoRepositorio() {
	}
	
	public List<Orientacao> getRepositoriorepositorio() {
		return orietacaoRepositorio;
	}
	
	public void adicionarOrientacao(Orientacao orientacao) {
		orietacaoRepositorio.add(orientacao);
	}
	
	public void removerOrientacao(Orientacao orientacao) {
		orietacaoRepositorio.remove(orientacao);
	}
	
	public void removerOrientacao(int indexOrientacao) {
		orietacaoRepositorio.remove(indexOrientacao);
	}
	
	public boolean atualizarOrientacao(int indexOrientacao, Orientacao orientacaoNova) {
		return orietacaoRepositorio.set(indexOrientacao, orientacaoNova) != null;
	}
	
	public Orientacao pegarOrientacao(int indexOrientacao) {
		return orietacaoRepositorio.get(indexOrientacao);
	}
	
	public int pegarIndexOrientacao(Orientacao orientacao) {
	    return OrientacaoRepositorio.orietacaoRepositorio.indexOf(orientacao);

    }
	
}
