package states;

public class Michigan extends State {
	public String getName(){
		return "Michigan";
	}
	protected int getGDP(){
		return 372400;
	}
	protected float getUnemploymentRate(){
		return 0.089F;
	}
	protected int getSize(){
		return 96716;
	}
	protected int getPopulation(){
		return 9883360;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
