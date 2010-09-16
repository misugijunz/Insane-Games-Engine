package InsaneGamesEngine;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Screen {

	public int width;
	public int height;
	private Surface surface;
	private Surface nextFrameSurface;
	private Graphics graphics;
	private Graphics2D graphicsBufferImage;
	private Graphics2D graphics2D;
	
	public Screen(int width, int height, Graphics graphics) {
		this.width = width;
		this.height = height;
		this.surface = new Surface();
		this.nextFrameSurface = new Surface();
		this.graphics = graphics;
		
		graphics2D = (Graphics2D) graphics;

		Dimension d = getSize();
		int w = d.width;
		int h = d.height;

		// Cria um buffer para a imagem
		BufferedImage buffImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		graphicsBufferImage = buffImg.createGraphics();
	}
	
	public void draw( GraphicImage graphicImage, Position position ) {	
		// TODO: nextFrameSurface.draw( graphicImage.getSurface() );
		graphicsBufferImage.drawImage(graphicImage, (int)position.getX(), (int)position.getY(), null);
		
	}
	
	public void flip() {
		// TODO: this.surface = this.nextFrameSurface;

		Toolkit.getDefaultToolkit().sync();

		// Desenha a imagem do buffer
		graphics2D.drawImage(buffImg, null, 0, 0);
		graphics.dispose();
	}

}
