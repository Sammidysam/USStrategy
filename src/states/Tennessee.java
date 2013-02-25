package states;

public class Tennessee extends State {
	public String getName(){
		return "Tennessee";
	}
	protected int getGDP(){
		return 250300;
	}
	protected float getUnemploymentRate(){
		return 0.076F;
	}
	protected int getSize(){
		return 42143;
	}
	protected int getPopulation(){
		return 6456243;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
