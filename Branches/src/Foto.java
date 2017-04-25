import processing.core.PApplet;

public class Foto implements Runnable {

	private float x, y, tam;
	private Mundo m;
	
	public Foto(Mundo m, float x, float y, float tam){
		this.x = x;
		this.y = y;
		this.tam = tam;
		this.m = m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Método que se encargará de pintar la imagen estática de las fotografías que se encontrará en
	 * la pantalla Revision3 y aparecerá mientras el usuario no active las animaciones de las fotografías
	 */
	public void pintarImagen(PApplet app){
		
	}
	
	/*
	 * Método que se encargará de activar las animaciones pertinentes de las fotografías que vaya 
	 * activando el usuario por medio de las zonas sensibles dadas en métodos de más abajo
	 */
	public void animacionFotos(){
		
	}
	
	
	//ZONAS SENSIBLES QUE ACTIVAN LAS ANIMACIONES DE CADA FOTOGRAFÍA EN PARTICULAR
	//Estos métodos retornan true si la distancia entre la posición de la manos según la clase Kinect (referencia que entrará gracias al Mundo)
	//está cercana a la posición de la fotografía a activar.
	public boolean zonaUno(){
		return true;
	}
	
	public boolean zonaDos(){
		return true;
	}
	
	public boolean zonaTres(){
		return true;
	}
	
	public boolean zonaCuatro(){
		return true;
	}
	
	public boolean zonaCinco(){
		return true;
	}
	
	public boolean zonaSeisObjetivo(){
		return true;
	}
	
	public boolean zonaSiete(){
		return true;
	}
	
	public boolean zonaOcho(){
		return true;
	}
	
	public boolean zonaNueve(){
		return true;
	}
	
}


