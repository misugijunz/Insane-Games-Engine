package InsaneGamesEngine;

public abstract class AutoMoveMind extends Mind {
	
	private Position currentPosition;
	private Position finalPosition;
	private double speed;

	public AutoMoveMind(Position currentPosition) {
		super();
		this.currentPosition = currentPosition;
	}

	@Override
	public void think() {
		// TODO: do logic
	}
}
