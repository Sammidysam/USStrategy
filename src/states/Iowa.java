package states;

public class Iowa extends State {
	public String getName(){
		return "Iowa";
	}
	protected int getGDP(){
		return 147200;
	}
	protected float getUnemploymentRate(){
		return 0.049F;
	}
	protected int getSize(){
		return 56272;
	}
	protected int getPopulation(){
		return 3074186;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
