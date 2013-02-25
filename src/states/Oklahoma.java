package states;

public class Oklahoma extends State {
	public String getName(){
		return "Oklahoma";
	}
	protected int getGDP(){
		return 160500;
	}
	protected float getUnemploymentRate(){
		return 0.051F;
	}
	protected int getSize(){
		return 69898;
	}
	protected int getPopulation(){
		return 3814820;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
