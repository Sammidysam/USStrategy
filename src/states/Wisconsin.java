package states;

public class Wisconsin extends State {
	public String getName(){
		return "Wisconsin";
	}
	protected int getGDP(){
		return 251400;
	}
	protected float getUnemploymentRate(){
		return 0.066F;
	}
	protected int getSize(){
		return 65497;
	}
	protected int getPopulation(){
		return 5726398;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
