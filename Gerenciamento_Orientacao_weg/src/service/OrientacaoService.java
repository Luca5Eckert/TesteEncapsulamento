package service;

import Dominio.Orientacao;
import repositorio.OrientacaoRepositorio;

public class OrientacaoService {
	private OrientacaoRepositorio repositorioOrientacao;
	
	public OrientacaoService() {
		this.setRepositorioOrientacao(new OrientacaoRepositorio());
	}

	public boolean atualizarOrientacao(Orientacao orientacao) {
		return this.repositorioOrientacao.atualizarOrientacao(this.repositorioOrientacao.pegarIndexOrientacao(orientacao), orientacao);
	}
	
	
	public OrientacaoRepositorio getRepositorioOrientacao() {
		return repositorioOrientacao;
	}

	public void setRepositorioOrientacao(OrientacaoRepositorio repositorioOrientacao) {
		this.repositorioOrientacao = repositorioOrientacao;
	}
	
	
}
