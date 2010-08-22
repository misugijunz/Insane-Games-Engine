package InsaneGamesEngine;


public class Sprite extends GraphicImage {

	private int numberOfFrames;
	private int currentFrame;
	
	public Sprite(Image image, int numberOfFrames) {
		this.currentFrame = 0;
		this.image = image;
		this.numberOfFrames = numberOfFrames;
	}
	
	public void nextFrame() {
		this.currentFrame = (this.currentFrame + 1) % numberOfFrames;
	}
	
	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
	}

}