import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Mundo implements Runnable {

	private boolean moverC, abrirC, champinonPrin, libreta, lis;
	private int pantalla, numFrame, numFrameA;
	private Libreta lib;
	private Lis liss;
	private ChampinonPrin champPrin;

	private PApplet app;

	private PImage[] cajonFlotante, abreCajon, acercaCajon;

	public Mundo(PApplet app) {
		this.app = app;
		System.out.println(app);
		inicializarVariables();
		cargarImagenes();
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
		cargarAcercarCajon();
	}

	/*
	 * Metodo que cargara con un for las imagenes para la animacion del arbol de
	 * la pantalla principal, de inicio
	 */
	public void cargarCajonF() {
		cajonFlotante = new PImage[28];
		System.out.println(app);
		for (int i = 0; i < cajonFlotante.length; i++) {
			cajonFlotante[i] = app.loadImage("../data/CajonFlotando/CajonFlotando_" + i + ".png");

		}
	}

	public void cargarAbreCajon() {

	}

	public void cargarAcercarCajon() {
		acercaCajon = new PImage[17];
		System.out.println(app);
		for (int i = 0; i < acercaCajon.length; i++) {
			acercaCajon[i] = app.loadImage("../data/CajonAcercar/CajonAcercar_" + i + ".png");
		}
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
			pintarAcercarCajon();
			pintarAbrirCajon();
			if (numFrameA == 20) {
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
			if (numFrame >= 28) {
				numFrame = 0;
			}
		}
	}

	/*
	 * Metodo que pintara la animacion de cuando el usuario abre el cajon
	 */
	public void pintarAcercarCajon() {
		app.image(acercaCajon[numFrame], app.width / 2, app.height / 2);
		if (app.frameCount % 5 == 0 && numFrame != 16) {
			if (numFrame <= 16) {
				numFrame++;
			} 
		}else if (numFrame >= 16) {
			numFrame = 16;
		}
		System.out.println(numFrame);
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
		if (app.keyCode == 87) {
			pantalla = 1;
			numFrame = 0;
		}
	}

}
