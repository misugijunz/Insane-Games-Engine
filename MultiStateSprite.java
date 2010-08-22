package InsaneGamesEngine;

import java.util.HashMap;
import java.util.Map;


public class MultiStateSprite extends Sprite {

	private State currentState;
	private Map<State, Sprite> sprites;
	
	public MultiStateSprite(Image image, int currentFrame, State state) {
		super(image, 0);
		this.setCurrentState(state);
		sprites = new HashMap<State, Sprite>();
	}
	
	public void setCurrentState(State state) {
		this.currentState = state;
		this.setCurrentFrame(0);
	}
	
	public void addSprite(State state, Sprite sprite) {
		sprites.put(state, sprite);
	}
	
	@Override
	public Image getImage() {
		
		return sprites.get(currentState).getImage();
	
	} 

}