import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Mundo implements Runnable {

	private boolean moverC, abrirC, champinonPrin, libreta, lis;
	private int pantalla, numFrame;
	private Libreta lib;
	private Lis liss;
	private ChampinonPrin champPrin;

	private PApplet app;

	private PImage[] cajonFlotante, abreCajon;

	public Mundo(PApplet app) {
		this.app = app;
		inicializarVariables();
	
	}

	public void inicializarVariables() {
		lis = false;
		libreta = false;
		champinonPrin = false;

		liss = new Lis();
		lib = new Libreta();
		champPrin = new ChampinonPrin();

		numFrame = 0;

	}
	public void cargarImagenes() {
		cargarCajonF();
		cargarAbreCajon();		
	}
	
	/*
	 * Metodo que cargara con un for las imagenes para la animacion del arbol de
	 * la pantalla principal, de inicio
	 */
	public void cargarCajonF() {
		cajonFlotante = new PImage[28];
		for (int i = 0; i < cajonFlotante.length; i++) {
			cajonFlotante[i] = app.loadImage("../data/CajonFlotando/CajonFlotando_" + i + ".png");
		}
	}
	
	public void cargarAbreCajon() {
	
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

		pantallas(app);

	}

	public void pantallas(PApplet app) {
		switch (pantalla) {

		// --------Pantalla Mesa Flotanto----------//
		case 0:
			pintarCajonFlotante(app);
			break;

		//
		case 1:
			pintarAbrirCajon();
			if (numFrame == 20) {
				liss.pintar(app);
				lib.pintar(app);
				champPrin.pintar(app);
			}

			break;

		default:
			break;
		}

	}

	// -------------ANIMACIONES-------------//

	/*
	 * Metodo que pintara la animacion del cajon flotando
	 */
	public void pintarCajonFlotante(PApplet app) {
		app.image(cajonFlotante[numFrame], app.width / 2, app.height / 2);
		if (app.frameCount % 5 == 0) {
			numFrame++;
			if (numFrame >= 29) {
				numFrame = 0;
			}
		}
	}

	/*
	 * Metodo que pintara la animacion de cuando el usuario abre el cajon
	 */
	public void pintarAbrirCajon() {

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

	// -----------------------MAKEY MAKEY----------------------//

	public void makey(PApplet app) {
		if (pantalla == 0) {
			iniciarApp(app);
		}
	}

	/*
	 * Metodo para cuando alguien toque el cajon, se cambie de pantalla y
	 * empiece la interaccion
	 */
	public void iniciarApp(PApplet app) {
		if (app.key == 'W') {
			pantalla = 1;
			numFrame = 0;

		}
	}

	

}
