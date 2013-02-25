package states;

public class Maryland extends State {
	public String getName(){
		return "Maryland";
	}
	protected int getGDP(){
		return 300000;
	}
	protected float getUnemploymentRate(){
		return 0.066F;
	}
	protected int getSize(){
		return 12407;
	}
	protected int getPopulation(){
		return 5884563;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
