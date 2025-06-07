package pacote1;

public class ClassePrivadaAlinhada {

	private ClasseAlinhada classeAlinhada;

	public ClassePrivadaAlinhada(int pontoX, int pontoY) {
		this.classeAlinhada = new ClasseAlinhada(pontoX, pontoY);
	}

	public int pegarPontoX() {
		return classeAlinhada.pontoX;
	}

	public void definirPontoX(int pontoX) {
		if (pontoX >= 0) {
			this.classeAlinhada.pontoX = pontoX;
			return;
		}
		throw new IllegalAccessError();
	}

	private class ClasseAlinhada {

		public int pontoX;
		public int pontoY;

		public ClasseAlinhada(int pontoX, int pontoY) {
			this.pontoX = pontoX;
			this.pontoY = pontoY;
		}

	}
}
