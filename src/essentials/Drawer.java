package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.StateHelper;

public class Drawer {
	private boolean lag = false;
	public void draw(GameContainer gc, Graphics g){
		try {
			StateHelper.getState(7).getFlag().draw(0, 0, gc.getWidth(), gc.getHeight());
		} catch (SlickException e) {
			e.printStackTrace();
		}
		if(lag)
			g.drawString("LAG DETECTED", gc.getWidth() - ("LAG DETECTED".length() * 10), 0);
	}
	public void setLag(boolean lag){
		this.lag = lag;
	}
}
