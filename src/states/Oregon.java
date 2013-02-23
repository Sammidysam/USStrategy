package states;

public class Oregon extends State {
	public String getName(){
		return "Oregon";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 800;
	}
}
