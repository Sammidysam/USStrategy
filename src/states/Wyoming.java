package states;

public class Wyoming extends State {
	public String getName(){
		return "Wyoming";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 8;
	}
}
