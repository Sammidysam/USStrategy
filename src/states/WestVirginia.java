package states;

public class WestVirginia extends State {
	public String getName(){
		return "West Virginia";
	}
	protected int getGDP(){
		return 66600;
	}
	protected float getUnemploymentRate(){
		return 0.075F;
	}
	protected int getSize(){
		return 24230;
	}
	protected int getPopulation(){
		return 1855413;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
