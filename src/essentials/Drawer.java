package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.StateHelper;

public class Drawer {
	private boolean lag = false;
	private String seceded = null;
	public void draw(GameContainer gc, Graphics g){
		try {
			StateHelper.getState(seceded).getFlag().draw(0, 0, gc.getWidth(), gc.getHeight() - (gc.getHeight() / 8));
			g.drawString(StateHelper.getState(seceded).getName() + " secedes from the union!", gc.getWidth() / 6, gc.getHeight() - (gc.getHeight() / 8));
		} catch (SlickException e) {
			e.printStackTrace();
		}
		if(lag)
			g.drawString("LAG DETECTED", gc.getWidth() - ("LAG DETECTED".length() * 10), 0);
	}
	public void setSeceded(String seceded){
		this.seceded = seceded;
	}
	public void setLag(boolean lag){
		this.lag = lag;
	}
}
