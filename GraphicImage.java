package InsaneGamesEngine;
import javax.swing.ImageIcon;
import java.awt.Image;

public abstract class GraphicImage extends GameObject {
	
	Image image;
	
	public Image getImage() {
		return image;
	}
	
	public void loadImage(String imageLocation) {
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(imageLocation));
		image = imageIcon.getImage();
	}

} 
