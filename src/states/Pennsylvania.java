package states;

public class Pennsylvania extends State {
	public String getName(){
		return "Pennsylvania";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 1000;
	}
}
