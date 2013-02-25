package states;

public class Mississippi extends State {
	public String getName(){
		return "Mississippi";
	}
	protected int getGDP(){
		return 98900;
	}
	protected float getUnemploymentRate(){
		return 0.086F;
	}
	protected int getSize(){
		return 48430;
	}
	protected int getPopulation(){
		return 2984926;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
