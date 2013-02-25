package states;

public class Missouri extends State {
	public String getName(){
		return "Missouri";
	}
	protected int getGDP(){
		return 246700;
	}
	protected float getUnemploymentRate(){
		return 0.067F;
	}
	protected int getSize(){
		return 69704;
	}
	protected int getPopulation(){
		return 6021988;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
