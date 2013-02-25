package states;

public class Utah extends State {
	public String getName(){
		return "Utah";
	}
	protected int getGDP(){
		return 116900;
	}
	protected float getUnemploymentRate(){
		return 0.052F;
	}
	protected int getSize(){
		return 84899;
	}
	protected int getPopulation(){
		return 2855287;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
