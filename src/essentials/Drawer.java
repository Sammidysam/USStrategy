package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.StateHelper;

public class Drawer {
	public void draw(GameContainer gc, Graphics g){
		g.drawString("Hello!", 500, 2);
		try {
			StateHelper.getState(0).getFlag().draw(0, 0, 0.5F);
			StateHelper.getState("Arkansas").getFlag().draw(0 + (StateHelper.getState(0).getFlag().getWidth() * 0.5F), 0 + (StateHelper.getState(0).getFlag().getHeight() * 0.5F), 0.5F);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
