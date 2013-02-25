package states;

public class Ohio extends State {
	public String getName(){
		return "Ohio";
	}
	protected int getGDP(){
		return 483400;
	}
	protected float getUnemploymentRate(){
		return 0.067F;
	}
	protected int getSize(){
		return 44825;
	}
	protected int getPopulation(){
		return 11544225;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
