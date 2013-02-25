package states;

public class Maine extends State {
	public String getName(){
		return "Maine";
	}
	protected int getGDP(){
		return 53200;
	}
	protected float getUnemploymentRate(){
		return 0.073F;
	}
	protected int getSize(){
		return 35385;
	}
	protected int getPopulation(){
		return 1329192;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
