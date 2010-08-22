package InsaneGamesEngine;


public class Screen {

	public int width;
	public int height;
	private Surface surface;
	private Surface nextFrameSurface;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		this.surface = new Surface();
		this.nextFrameSurface = new Surface();
	}
	
	public void draw( GraphicImage graphicImage, Position position ) {	
		// TODO: nextFrameSurface.draw( graphicImage.getSurface() );
	}
	
	public void flip() {
		// TODO: this.surface = this.nextFrameSurface;
	}

}