package states;

public class Arizona extends State {
	public String getName(){
		return "Arizona";
	}
	protected int getGDP(){
		return 261300;
	}
	protected float getUnemploymentRate(){
		return 0.079F;
	}
	protected int getSize(){
		return 113990;
	}
	protected int getPopulation(){
		return 6553255;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
