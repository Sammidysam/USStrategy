package essentials;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import states.Texas;

public class Drawer {
	public void draw(GameContainer gc, Graphics g){
		g.drawString("Hello!", 500, 2);
		Texas texas = new Texas();
		try {
			texas.getFlag().draw(0, 0);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
