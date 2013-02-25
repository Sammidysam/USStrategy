package states;

public class NorthDakota extends State {
	public String getName(){
		return "North Dakota";
	}
	protected int getGDP(){
		return 33400;
	}
	protected float getUnemploymentRate(){
		return 0.032F;
	}
	protected int getSize(){
		return 70700;
	}
	protected int getPopulation(){
		return 827527;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
