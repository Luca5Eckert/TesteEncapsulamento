package Dominio;

public enum TipoOrientacao {
	MANUAL_OPERACAO("Manual de Operação", 1),
    PROCEDIMENTO_SEGURANCA("Procedimento de Segurança", 2),
    MANUTENCAO_REPAROS("Manutenção e Reparos", 3),
    TESTES_DIAGNOSTICO("Testes e Diagnóstico", 4),
    MANUAL_CONDUTA_OPERACOES("Manual de Conduta e Operações Setoriais", 5);

    private final String descricao;
    private final int numero;

    TipoOrientacao(String descricao, int numero) {
        this.descricao = descricao;
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    public int getNumero() {
    	return numero;
    }
    
    public static TipoOrientacao pegarOrientacao(int indexOrientacao) {
        for (TipoOrientacao tipo : TipoOrientacao.values()) {
            if (tipo.getNumero() == indexOrientacao) {
                return tipo;
            }
        }
		return TipoOrientacao.MANUAL_OPERACAO;
    
    }
    
    
    
}
