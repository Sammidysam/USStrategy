package states;

public class Wyoming extends State {
	public String getName(){
		return "Wyoming";
	}
	protected int getGDP(){
		return 38200;
	}
	protected float getUnemploymentRate(){
		return 0.049F;
	}
	protected int getSize(){
		return 97814;
	}
	protected int getPopulation(){
		return 576412;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
