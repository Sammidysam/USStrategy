package states;

public class Illinois extends State {
	public String getName(){
		return "Illinois";
	}
	protected int getGDP(){
		return 644200;
	}
	protected float getUnemploymentRate(){
		return 0.087F;
	}
	protected int getSize(){
		return 57914;
	}
	protected int getPopulation(){
		return 12875255;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
