package states;

public class Connecticut extends State {
	public String getName(){
		return "Connecticut";
	}
	protected int getGDP(){
		return 233400;
	}
	protected float getUnemploymentRate(){
		return 0.086F;
	}
	protected int getSize(){
		return 5543;
	}
	protected int getPopulation(){
		return 3590347;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
