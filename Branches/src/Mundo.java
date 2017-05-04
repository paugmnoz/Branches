import processing.core.PApplet;

public class Mundo implements Runnable {

	private boolean moverC, abrirC, champinonPrin, libreta, lis;
	private int pantalla;
	
	public Mundo(PApplet app) {
		
		cargarCajon();
		cargarMoverCajon();
		inicializarVariables();
	}

	public void inicializarVariables() {
		champinonPrin = false;
		libreta  = false;
		lis =  false;
		
	}

	/*
	 * Metodo que cargara con un for las imagenes para la animacion del arbol de
	 * la pantalla principal, de inicio
	 */
	public void cargarCajon() {

	}

	/*
	 * Metodo que cargara con un for las imagenes para la animacion del arbol de
	 * la pantalla de activación de la aplicación
	 */
	public void cargarMoverCajon() {

	}

	/*
	 * metodo para visualizar la aplicación
	 */
	public void pintar(PApplet app) {
		pantallas();
		
	}

	public void pantallas() {
		switch (pantalla) {
		
		//--------Pantalla Mesa Flotanto----------//
		case 0:
			pintarCajonFlotante();
			break;
			
			//
		case 1:
			pintarAbrirCajon();
			pintarChampinonPrin();
			pintarLibreta();
			pintarLis();
			
			break;

		default:
			break;
		}
		
	}

	public void pintarCajonFlotante() {
		// TODO Auto-generated method stub
		
	}
	
	public void pintarAbrirCajon() {
		// TODO Auto-generated method stub
		
	}
	
	public void pintarLis() {
		// TODO Auto-generated method stub
		
	}

	public void pintarLibreta() {
		// TODO Auto-generated method stub
		
	}

	public void pintarChampinonPrin() {
		// TODO Auto-generated method stub
	}
	
	
	// -------------ANIMACIONES-------------//

	/*
	 * Metodo que contendrá la animación de cuando se cierra la aplicación
	 */
	public void abreCajon() {

	}

	/*
	 * Metodo que movera el cajon cada vez que pase alguien al frente de la
	 * instalación
	 */
	public void moverCajon() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public void makey() {

	}

}
