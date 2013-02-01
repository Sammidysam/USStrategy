package states;

public class StateHelper {
	public static State getState(int id){
		State state = null;
		switch (id){
			case 0:
				state = new Alabama();
				break;
			default:
				System.out.println(id + " causing trouble");
				break;
		}
		return state;
	}
	public static State getState(String name){
		State state = null;
		switch (name){
			case "Texas":
				state = new Alabama();
				break;
			default:
				System.out.println(name + " causing trouble");
				break;
		}
		return state;
	}
}
