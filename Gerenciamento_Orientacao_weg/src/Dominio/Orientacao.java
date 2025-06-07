package Dominio;

public class Orientacao {
    private String titulo;
    private TipoOrientacao tipo;
    private String conteudoPortugues;
    private String conteudoIngles;
    private String conteudoAlemao;
    private String conteudoEspanhol;

    public Orientacao(String titulo, TipoOrientacao tipo, String conteudoPortugues, String conteudoIngles, String conteudoAlemao, String conteudoEspanhol) {
        this.titulo = titulo;
        this.setTipo(tipo);
        this.setConteudoPortugues(conteudoPortugues);
        this.setConteudoIngles(conteudoIngles);
        this.setConteudoAlemao(conteudoAlemao);
        this.setConteudoEspanhol(conteudoEspanhol);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }

	public TipoOrientacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoOrientacao tipo) {
		this.tipo = tipo;
	}

	public String getConteudoPortugues() {
		return conteudoPortugues;
	}

	public void setConteudoPortugues(String conteudoPortugues) {
		this.conteudoPortugues = conteudoPortugues;
	}

	public String getConteudoIngles() {
		return conteudoIngles;
	}

	public void setConteudoIngles(String conteudoIngles) {
		this.conteudoIngles = conteudoIngles;
	}

	public String getConteudoAlemao() {
		return conteudoAlemao;
	}

	public void setConteudoAlemao(String conteudoAlemao) {
		this.conteudoAlemao = conteudoAlemao;
	}

	public String getConteudoEspanhol() {
		return conteudoEspanhol;
	}

	public void setConteudoEspanhol(String conteudoEspanhol) {
		this.conteudoEspanhol = conteudoEspanhol;
	}

    
    
}