package states;

public class SouthDakota extends State {
	public String getName(){
		return "South Dakota";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 10;
	}
}
