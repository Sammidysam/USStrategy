package states;

public class RhodeIsland extends State {
	public String getName(){
		return "Rhode Island";
	}
	protected int getGDP(){
		return 49500;
	}
	protected float getUnemploymentRate(){
		return 0.102F;
	}
	protected int getSize(){
		return 1214;
	}
	protected int getPopulation(){
		return 1050292;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
