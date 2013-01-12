package states;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class State {
	public String getName(){
		return "";
	}
	public Image getFlag() throws SlickException{
		return new Image("res/flags/" + getName() + ".png");
	}
}
