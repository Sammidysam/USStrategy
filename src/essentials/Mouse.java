package essentials;

import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;

public class Mouse implements MouseListener {
	private boolean acceptingInput = true;
	private int x;
	private int y;
	private int change;
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	private void setX(int x){
		this.x = x;
	}
	private void setY(int y){
		this.y = y;
	}
	public void inputEnded() {
		
	}
	public void inputStarted() {
		change = 0;
	}
	public boolean isAcceptingInput() {
		return acceptingInput;
	}
	public void setAcceptingInput(boolean acceptingInput){
		this.acceptingInput = acceptingInput;
	}
	public void setInput(Input input) {
		
	}
	public void mouseClicked(int button, int x, int y, int clickCount) {
		
	}
	public void mouseDragged(int oldX, int oldY, int newX, int newY) {
		setX(newX);
		setY(newY);
	}
	public void mouseMoved(int oldX, int oldY, int newX, int newY) {
		setX(newX);
		setY(newY);
	}
	public void mousePressed(int button, int x, int y) {
		
	}
	public void mouseReleased(int button, int x, int y) {
		
	}
	public void mouseWheelMoved(int change) {
		this.change = change;
	}
	public int getMouseWheelMovement(){
		return change;
	}
	public boolean isPositive(int change){
		if(change > 0)
			return true;
		else
			return false;
	}
}
