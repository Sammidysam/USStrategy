package states;

public class California extends State {
	public String getName(){
		return "California";
	}
	protected int getGDP(){
		return 1936400;
	}
	protected float getUnemploymentRate(){
		return 0.098F;
	}
	protected int getSize(){
		return 163696;
	}
	protected int getPopulation(){
		return 38041430;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
