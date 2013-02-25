package states;

public class Texas extends State {
	public String getName(){
		return "Texas";
	}
	protected int getGDP(){
		return 1307432;
	}
	protected float getUnemploymentRate(){
		return 0.061F;
	}
	protected int getSize(){
		return 268581;
	}
	protected int getPopulation(){
		return 26059203;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
