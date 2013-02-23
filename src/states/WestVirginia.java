package states;

public class WestVirginia extends State {
	public String getName(){
		return "West Virginia";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 200;
	}
}
