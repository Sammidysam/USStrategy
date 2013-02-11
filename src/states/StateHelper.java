package states;

public class StateHelper {
	public static final int ALABAMA = 0;
	public static final int ARIZONA = 1;
	public static final int ARKANSAS = 2;
	public static final int CALIFORNIA = 3;
	public static final int COLORADO = 4;
	public static final int CONNECTICUT = 5;
	public static final int DELAWARE = 6;
	public static final int FLORIDA = 7;
	public static final int GEORGIA = 8;
	public static final int IDAHO = 9;
	public static final int ILLINOIS = 10;
	public static final int INDIANA = 11;
	public static final int IOWA = 12;
	public static final int KANSAS = 13;
	public static final int KENTUCKY = 14;
	public static final int LOUISIANA = 15;
	public static final int MAINE = 16;
	public static final int MARYLAND = 17;
	public static final int MASSACHUSETTS = 18;
	public static final int MICHIGAN = 19;
	public static final int MINNESOTA = 20;
	public static final int MISSISSIPPI = 21;
	public static final int MISSOURI = 22;
	public static final int MONTANA = 23;
	public static final int NEBRASKA = 24;
	public static final int NEVADA = 25;
	public static final int NEW_HAMPSHIRE = 26;
	public static final int NEW_JERSEY = 27;
	public static final int NEW_MEXICO = 28;
	public static final int NEW_YORK = 29;
	public static final int NORTH_CAROLINA = 30;
	public static final int NORTH_DAKOTA = 31;
	public static final int OHIO = 32;
	public static final int OKLAHOMA = 33;
	public static final int OREGON = 34;
	public static final int PENNSYLVANIA = 35;
	public static final int RHODE_ISLAND = 36;
	public static final int SOUTH_CAROLINA = 37;
	public static final int SOUTH_DAKOTA = 38;
	public static final int TENNESSEE = 39;
	public static final int TEXAS = 40;
	public static final int UTAH = 41;
	public static final int VERMONT = 42;
	public static final int VIRGINIA = 43;
	public static final int WASHINGTON = 44;
	public static final int WEST_VIRGINIA = 45;
	public static final int WISCONSIN = 46;
	public static final int WYOMING = 47;
	public static State getState(int id){
		State state = null;
		switch (id){
			case ALABAMA:
				state = new Alabama();
				break;
			case ARIZONA:
				state = new Arizona();
				break;
			case ARKANSAS:
				state = new Arkansas();
				break;
			case CALIFORNIA:
				state = new California();
				break;
			case COLORADO:
				state = new Colorado();
				break;
			case CONNECTICUT:
				state = new Connecticut();
				break;
			case DELAWARE:
				state = new Delaware();
				break;
			case FLORIDA:
				state = new Florida();
				break;
			case GEORGIA:
				state = new Georgia();
				break;
			case IDAHO:
				state = new Idaho();
				break;
			case ILLINOIS:
				state = new Illinois();
				break;
			case INDIANA:
				state = new Indiana();
				break;
			case IOWA:
				state = new Iowa();
				break;
			case KANSAS:
				state = new Kansas();
				break;
			case KENTUCKY:
				state = new Kentucky();
				break;
			case LOUISIANA:
				state = new Louisiana();
				break;
			case MAINE:
				state = new Maine();
				break;
			case MARYLAND:
				state = new Maryland();
				break;
			case MASSACHUSETTS:
				state = new Massachusetts();
				break;
			case MICHIGAN:
				state = new Michigan();
				break;
			case MINNESOTA:
				state = new Minnesota();
				break;
			case MISSISSIPPI:
				state = new Mississippi();
				break;
			case MISSOURI:
				state = new Missouri();
				break;
			case MONTANA:
				state = new Montana();
				break;
			case NEBRASKA:
				state = new Nebraska();
				break;
			case NEVADA:
				state = new Nevada();
				break;
			case NEW_HAMPSHIRE:
				state = new NewHampshire();
				break;
			case NEW_JERSEY:
				state = new NewJersey();
				break;
			case NEW_MEXICO:
				state = new NewMexico();
				break;
			case NEW_YORK:
				state = new NewYork();
				break;
			case NORTH_CAROLINA:
				state = new NorthCarolina();
				break;
			case NORTH_DAKOTA:
				state = new NorthDakota();
				break;
			case OHIO:
				state = new Ohio();
				break;
			case OKLAHOMA:
				state = new Oklahoma();
				break;
			case OREGON:
				state = new Oregon();
				break;
			case PENNSYLVANIA:
				state = new Pennsylvania();
				break;
			case RHODE_ISLAND:
				state = new RhodeIsland();
				break;
			case SOUTH_CAROLINA:
				state = new SouthCarolina();
				break;
			case SOUTH_DAKOTA:
				state = new SouthDakota();
				break;
			case TENNESSEE:
				state = new Tennessee();
				break;
			case TEXAS:
				state = new Texas();
				break;
			case UTAH:
				state = new Utah();
				break;
			case VERMONT:
				state = new Vermont();
				break;
			case VIRGINIA:
				state = new Virginia();
				break;
			case WASHINGTON:
				state = new Washington();
				break;
			case WEST_VIRGINIA:
				state = new WestVirginia();
				break;
			case WISCONSIN:
				state = new Wisconsin();
				break;
			case WYOMING:
				state = new Wyoming();
				break;
			default:
				System.out.println(id + " causing trouble");
				break;
		}
		return state;
	}
	public static State getState(String name){
		State state = null;
		switch(name){
			case "Alabama":
				state = new Alabama();
				break;
			case "Arizona":
				state = new Arizona();
				break;
			case "Arkansas":
				state = new Arkansas();
				break;
			case "California":
				state = new California();
				break;
			case "Colorado":
				state = new Colorado();
				break;
			case "Connecticut":
				state = new Connecticut();
				break;
			case "Delaware":
				state = new Delaware();
				break;
			case "Florida":
				state = new Florida();
				break;
			case "Georgia":
				state = new Georgia();
				break;
			case "Idaho":
				state = new Idaho();
				break;
			case "Illinois":
				state = new Illinois();
				break;
			case "Indiana":
				state = new Indiana();
				break;
			case "Iowa":
				state = new Iowa();
				break;
			case "Kansas":
				state = new Kansas();
				break;
			case "Kentucky":
				state = new Kentucky();
				break;
			case "Louisiana":
				state = new Louisiana();
				break;
			case "Maine":
				state = new Maine();
				break;
			case "Maryland":
				state = new Maryland();
				break;
			case "Massachusetts":
				state = new Massachusetts();
				break;
			case "Michigan":
				state = new Michigan();
				break;
			case "Minnesota":
				state = new Minnesota();
				break;
			case "Mississippi":
				state = new Mississippi();
				break;
			case "Missouri":
				state = new Missouri();
				break;
			case "Montana":
				state = new Montana();
				break;
			case "Nebraska":
				state = new Nebraska();
				break;
			case "Nevada":
				state = new Nevada();
				break;
			case "New Hampshire":
				state = new NewHampshire();
				break;
			case "New Jersey":
				state = new NewJersey();
				break;
			case "New Mexico":
				state = new NewMexico();
				break;
			case "New York":
				state = new NewYork();
				break;
			case "North Carolina":
				state = new NorthCarolina();
				break;
			case "North Dakota":
				state = new NorthDakota();
				break;
			case "Ohio":
				state = new Ohio();
				break;
			case "Oklahoma":
				state = new Oklahoma();
				break;
			case "Oregon":
				state = new Oregon();
				break;
			case "Pennsylvania":
				state = new Pennsylvania();
				break;
			case "Rhode Island":
				state = new RhodeIsland();
				break;
			case "South Carolina":
				state = new SouthCarolina();
				break;
			case "South Dakota":
				state = new SouthDakota();
				break;
			case "Tennessee":
				state = new Tennessee();
				break;
			case "Texas":
				state = new Texas();
				break;
			case "Utah":
				state = new Utah();
				break;
			case "Vermont":
				state = new Vermont();
				break;
			case "Virginia":
				state = new Virginia();
				break;
			case "Washington":
				state = new Washington();
				break;
			case "West Virginia":
				state = new WestVirginia();
				break;
			case "Wisconsin":
				state = new Wisconsin();
				break;
			case "Wyoming":
				state = new Wyoming();
				break;
			default:
				System.out.println(name + " causing trouble");
				break;
		}
		return state;
	}
}
