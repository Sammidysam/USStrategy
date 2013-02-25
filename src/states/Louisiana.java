package states;

public class Louisiana extends State {
	public String getName(){
		return "Louisiana";
	}
	protected int getGDP(){
		return 213600;
	}
	protected float getUnemploymentRate(){
		return 0.055F;
	}
	protected int getSize(){
		return 51843;
	}
	protected int getPopulation(){
		return 4601893;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
