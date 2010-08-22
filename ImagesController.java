package InsaneGamesEngine;

import java.util.Map;

public class ImagesController {

	private static ImagesController instance; // singleton pattern
	
	private Map<String, Image> loadedImages;
	
	private ImagesController() {
	}
	
	public static synchronized ImagesController getInstance() {
		if ( instance == null ) {
			instance = new ImagesController();
		}
		
		return instance;
	}
	
	public void loadImage(String imageFileName, String imageName) {
		// TODO: Carregar imagem e colocar no map
		// this.loadedImages.
	}
	
	public Image getImage(String imageName) {
		return loadedImages.get(imageName);
	}
	
	public void removeAll() {
		loadedImages.clear();
	}
	
}
