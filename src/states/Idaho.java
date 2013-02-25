package states;

public class Idaho extends State {
	public String getName(){
		return "Idaho";
	}
	protected int getGDP(){
		return 54800;
	}
	protected float getUnemploymentRate(){
		return 0.066F;
	}
	protected int getSize(){
		return 83570;
	}
	protected int getPopulation(){
		return 1595728;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
