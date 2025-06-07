import aplication.Sistema;

public class PrincipalMain {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		try{
			sistema.iniciarSistema();
		} catch ( Exception e ) {
			e.getStackTrace();
		
		} 
	}
	
}
