package aplication;

import aplication.implementacoes.IdiomaImplementacao;
import aplication.implementacoes.InglesImplementacao;
import aplication.implementacoes.PortuguesImplementacao;


public class IdiomaFactory {

	public static IdiomaImplementacao pegarIdiomaImplementacao(int tipoMenu) {
		return switch(tipoMenu){
		case 1 -> new PortuguesImplementacao();
		case 2 -> new InglesImplementacao();
		default -> new PortuguesImplementacao();
		};
	}
	
}
