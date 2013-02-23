package states;

public class Minnesota extends State {
	public String getName(){
		return "Minnesota";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 1000;
	}
}
