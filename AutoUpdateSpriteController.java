package InsaneGamesEngine;

import java.util.HashSet;
import java.util.Set;

public class AutoUpdateSpriteController {
	
	private Set<SmartSprite> setOfSmartSprite;

	public AutoUpdateSpriteController() {
		
		setOfSmartSprite = new HashSet<SmartSprite>();
	
	}
	
	public void addBehaviouredSprite( SmartSprite behaviouredSprite ) {
		setOfSmartSprite.add( behaviouredSprite );
	}

	public void updateAll() {
		
		for ( SmartSprite smartSprite : setOfSmartSprite ) {
			
			smartSprite.update();
			
		}
		
	}
}
