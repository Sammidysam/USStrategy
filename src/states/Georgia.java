package states;

public class Georgia extends State {
	public String getName(){
		return "Georgia";
	}
	protected int getGDP(){
		return 403100;
	}
	protected float getUnemploymentRate(){
		return 0.086F;
	}
	protected int getSize(){
		return 59425;
	}
	protected int getPopulation(){
		return 9919945;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
