package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.StateHelper;

public class Drawer {
	private boolean lag = false;
	private int currentState = 0;
	public void draw(GameContainer gc, Graphics g){
		try {
			StateHelper.getState(currentState).getFlag().draw(0, 0, gc.getWidth(), gc.getHeight());
		} catch (SlickException e) {
			e.printStackTrace();
		}
		if(lag)
			g.drawString("LAG DETECTED", gc.getWidth() - ("LAG DETECTED".length() * 10), 0);
	}
	public void setCurrentState(boolean up){
		if(up){
			currentState++;
			if(currentState == 48)
				currentState = 0;
		}
		else {
			currentState--;
			if(currentState == -1)
				currentState = 47;
		}
	}
	public void setLag(boolean lag){
		this.lag = lag;
	}
}
