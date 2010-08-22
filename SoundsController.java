package InsaneGamesEngine;

import java.util.Map;

public class SoundsController {

	private static SoundsController instance; // singleton pattern
	
	private Map<String, Image> loadedSounds;
	
	private SoundsController() {
	}
	
	public static synchronized SoundsController getInstance() {
		if ( instance == null ) {
			instance = new SoundsController();
		}
		
		return instance;
	}
	
	public void loadSound(String soundFileName, String soundName) {
		// TODO: Carregar imagem e colocar no map
		// this.loadedImages.
	}
	
	public Image getSound(String soundName) {
		return loadedSounds.get(soundName);
	}
	
	public void removeAll() {
		loadedSounds.clear();
	}
	
}
