package states;

public class Wisconsin extends State {
	public String getName(){
		return "Wisconsin";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 900;
	}
}
