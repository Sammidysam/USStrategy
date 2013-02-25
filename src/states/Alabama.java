package states;

public class Alabama extends State {
	public String getName(){
		return "Alabama";
	}
	protected int getGDP(){
		return 174400;
	}
	protected float getUnemploymentRate(){
		return 0.071F;
	}
	protected int getSize(){
		return 52419;
	}
	protected int getPopulation(){
		return 4822023;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
