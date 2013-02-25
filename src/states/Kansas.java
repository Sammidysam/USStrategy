package states;

public class Kansas extends State {
	public String getName(){
		return "Kansas";
	}
	protected int getGDP(){
		return 128500;
	}
	protected float getUnemploymentRate(){
		return 0.054F;
	}
	protected int getSize(){
		return 82277;
	}
	protected int getPopulation(){
		return 2885905;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
