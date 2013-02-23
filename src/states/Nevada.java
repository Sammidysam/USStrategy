package states;

public class Nevada extends State {
	public String getName(){
		return "Nevada";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 500;
	}
}
