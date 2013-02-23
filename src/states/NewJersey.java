package states;

public class NewJersey extends State {
	public String getName(){
		return "New Jersey";
	}
	public int getSecedeProbability(){
		return Integer.MAX_VALUE - 750;
	}
}
