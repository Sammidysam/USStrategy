package states;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Texas extends State {
	public String getName(){
		return "Texas";
	}
	public Image getFlag() throws SlickException{
		return new Image("res/flags/" + getName() + ".png");
	}
}
