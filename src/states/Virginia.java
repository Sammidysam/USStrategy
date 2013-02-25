package states;

public class Virginia extends State {
	public String getName(){
		return "Virginia";
	}
	protected int getGDP(){
		return 427700;
	}
	protected float getUnemploymentRate(){
		return 0.055F;
	}
	protected int getSize(){
		return 42774;
	}
	protected int getPopulation(){
		return 8185867;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
