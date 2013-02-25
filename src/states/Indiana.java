package states;

public class Indiana extends State {
	public String getName(){
		return "Indiana";
	}
	protected int getGDP(){
		return 267600;
	}
	protected float getUnemploymentRate(){
		return 0.082F;
	}
	protected int getSize(){
		return 36418;
	}
	protected int getPopulation(){
		return 6537334;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}