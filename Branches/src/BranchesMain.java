import processing.core.PApplet;

public class BranchesMain extends PApplet {
	
	private Mundo m;
	private PApplet app;
	
	public static void main(String[] args) {
		PApplet.main("BranchesMain");
	}
	
	@Override
	public void settings() {
		fullScreen();
	}
	
	@Override
	public void setup() {
		m = new Mundo(app);
	}
	
	@Override
	public void draw() {
		background(64, 60, 112);
		m.pintar(this);
	}
	
	@Override
	public void keyPressed() {
		m.makey();
	}
	
}
