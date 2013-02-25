package states;

public class Nevada extends State {
	public String getName(){
		return "Nevada";
	}
	protected int getGDP(){
		return 127500;
	}
	protected float getUnemploymentRate(){
		return 0.102F;
	}
	protected int getSize(){
		return 110662;
	}
	protected int getPopulation(){
		return 2758931;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
