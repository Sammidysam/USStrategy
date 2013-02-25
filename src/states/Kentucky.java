package states;

public class Kentucky extends State {
	public String getName(){
		return "Kentucky";
	}
	protected int getGDP(){
		return 161400;
	}
	protected float getUnemploymentRate(){
		return 0.081F;
	}
	protected int getSize(){
		return 40409;
	}
	protected int getPopulation(){
		return 4380415;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
