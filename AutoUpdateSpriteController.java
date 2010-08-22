package InsaneGamesEngine;

import java.util.HashSet;
import java.util.Set;

public class AutoUpdateSpriteController {
	
	private Set<BehaviouredSprite> setOfBehaviuoredSprite;

	public AutoUpdateSpriteController() {
		
		setOfBehaviuoredSprite = new HashSet<BehaviouredSprite>();
	
	}
	
	public void addBehaviouredSprite( BehaviouredSprite behaviouredSprite ) {
		setOfBehaviuoredSprite.add( behaviouredSprite );
	}

	public void updateAll() {
		
		for ( BehaviouredSprite behaviouredSprite : setOfBehaviuoredSprite ) {
			
			behaviouredSprite.update();
			
		}
		
	}
}
