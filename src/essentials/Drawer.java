package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.StateHelper;

public class Drawer {
	public void draw(GameContainer gc, Graphics g){
		g.drawString("Hello!", 500, 2);
		try {
			StateHelper.getState(7).getFlag().draw(0, 0, gc.getWidth(), gc.getHeight());
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
