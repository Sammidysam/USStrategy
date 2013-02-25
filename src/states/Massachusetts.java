package states;

public class Massachusetts extends State {
	public String getName(){
		return "Massachusetts";
	}
	protected int getGDP(){
		return 377700;
	}
	protected float getUnemploymentRate(){
		return 0.067F;
	}
	protected int getSize(){
		return 10555;
	}
	protected int getPopulation(){
		return 6646144;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
