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
	public int getSecedeProbability(){
		return 50000000 - (48000000 - (getGDPRank() * 1000000));
	}
	protected int getGDPRank(){
		return 0;
	}
}
