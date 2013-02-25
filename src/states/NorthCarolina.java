package states;

public class NorthCarolina extends State {
	public String getName(){
		return "North Carolina";
	}
	protected int getGDP(){
		return 407400;
	}
	protected float getUnemploymentRate(){
		return 0.092F;
	}
	protected int getSize(){
		return 53819;
	}
	protected int getPopulation(){
		return 9752073;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
