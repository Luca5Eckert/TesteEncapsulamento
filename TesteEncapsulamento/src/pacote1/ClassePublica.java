package pacote1;

public class ClassePublica {
	
	private int pontoX;
	private int pontoY;
	private ClassePrivadaPacote classePrivadaPacote;
	
	public ClassePublica(int pontoX, int pontoY) {
		this.setPontoX(pontoX);
		this.setPontoY(pontoY);
	}

	public int getPontoX() {
		return pontoX;
	}

	public ClassePrivadaPacote getClassePrivadaPacote() {
		return classePrivadaPacote;
	}

	public void setClassePrivadaPacote(ClassePrivadaPacote classePrivadaPacote) {
		this.classePrivadaPacote = classePrivadaPacote;
	}

	public void setPontoX(int pontoX) {
		if( !(pontoX >= 0)) {
			throw new IllegalAccessError();
		}
		this.pontoX = pontoX;
	}

	public int getPontoY() {
		return pontoY;
	}

	public void setPontoY(int pontoY) {
		this.pontoY = pontoY;
	}
	
	

}
