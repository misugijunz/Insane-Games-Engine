package InsaneGamesEngine;


public abstract class GameObject {

	private Position position;
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void move(double x, double y) {
	}
	
}
