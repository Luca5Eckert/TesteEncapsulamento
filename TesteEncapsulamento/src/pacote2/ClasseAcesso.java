package pacote2;

import pacote1.ClassePrivadaAlinhada;
import pacote1.ClassePublica;

public class ClasseAcesso {
	
	ClassePublica classePublica;
	ClassePrivadaAlinhada classePrivadaAlinhada;
	
	public ClasseAcesso(ClassePublica classePublica, ClassePrivadaAlinhada classePrivadaAlinhada) {
		this.classePublica = classePublica;
		this.classePrivadaAlinhada = classePrivadaAlinhada;
	}

	public void definirPontoXClassePrivada(int pontoX){
		this.classePrivadaAlinhada.definirPontoX(pontoX);
	}
	
	public static void main(String[] args) {
		
		System.out.println("TESTE TESTE");
		
		var acesso = new ClasseAcesso(new ClassePublica(1, 1), new ClassePrivadaAlinhada(1, 4));
		
		acesso.definirPontoXClassePrivada(2);
		
		int pontoX = acesso.classePrivadaAlinhada.pegarPontoX();
	
		System.out.println(pontoX);
	}

}
