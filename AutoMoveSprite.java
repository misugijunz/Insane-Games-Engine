package InsaneGamesEngine;

// TODO: rever como fazer para ter Sprite e MultiStateSprite

public abstract class AutoMoveSprite extends Sprite implements BehaviouredSprite {
	
	private Position finalPosition;
	private double speed;

	public AutoMoveSprite(Image image, int numberOfFrames) {
		super(image, numberOfFrames);
		this.speed = 0;
		finalPosition = new Position(0, 0);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		// Move towards finalPosition
		
	}

	
}
