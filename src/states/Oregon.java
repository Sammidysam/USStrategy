package states;

public class Oregon extends State {
	public String getName(){
		return "Oregon";
	}
	protected int getGDP(){
		return 168900;
	}
	protected float getUnemploymentRate(){
		return 0.084F;
	}
	protected int getSize(){
		return 98381;
	}
	protected int getPopulation(){
		return 3889353;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
