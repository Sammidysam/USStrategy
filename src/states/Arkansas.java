package states;

public class Arkansas extends State {
	public String getName(){
		return "Arkansas";
	}
	protected int getGDP(){
		return 105800;
	}
	protected float getUnemploymentRate(){
		return 0.071F;
	}
	protected int getSize(){
		return 53179;
	}
	protected int getPopulation(){
		return 2949131;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
