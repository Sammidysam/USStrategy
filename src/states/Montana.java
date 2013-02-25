package states;

public class Montana extends State {
	public String getName(){
		return "Montana";
	}
	protected int getGDP(){
		return 37200;
	}
	protected float getUnemploymentRate(){
		return 0.057F;
	}
	protected int getSize(){
		return 147042;
	}
	protected int getPopulation(){
		return 1005141;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
