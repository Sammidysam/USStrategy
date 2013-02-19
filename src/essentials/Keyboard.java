package essentials;

import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

public class Keyboard implements KeyListener {
	private boolean acceptingInput = true;
	public void inputEnded() {
		
	}
	public void inputStarted() {
		
	}
	public boolean isAcceptingInput() {
		return acceptingInput;
	}
	public void setAcceptingInput(boolean acceptingInput){
		this.acceptingInput = acceptingInput;
	}
	public void setInput(Input input) {
		
	}
	public void keyPressed(int keyCode, char c) {
	}
	public void keyReleased(int keyCode, char c) {
		
	}
}
