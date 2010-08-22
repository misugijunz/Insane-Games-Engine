package InsaneGamesEngine;


public class FrameController {
	
	private double tick;
	private double startTime;
	private int fps;
	
	public FrameController() {
		this.tick = 0;
		this.fps = 60;
		// TODO: this.startTime = current time;
	}

	public FrameController(int fps) {
		this.tick = 0;
		this.fps = fps;
	}
	
	public void restartCount() {
		this.tick = 0;
	}
	
	public void tick() {
		this.tick++;
	}
	
	public double getTicks() {
		return this.tick;
	}
	
	public double getElapseTime() {
		return 0;
		// TODO: return the current time tick - this.startTime
	}
	
	public boolean isTimeToFlip() {
		boolean isTimeToFlip = false;
		
		// TODO: implementar
//		if ( ... ) {
//			isTimeToFlip = true;
//		}
		
		return isTimeToFlip;
	}

}