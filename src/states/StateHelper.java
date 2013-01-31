package states;

public class StateHelper {
	public static State getState(int id){
		State state = null;
		switch (id){
			case 0:
				state = new Texas();
//				though 0 will not be Texas's id
				break;
		}
		return state;
	}
	public static State getState(String name){
		State state = null;
		switch (name){
			case "Texas":
				state = new Texas();
//				though 0 will not be Texas's id
				break;
		}
		return state;
	}
}
