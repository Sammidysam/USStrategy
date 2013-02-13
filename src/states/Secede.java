package states;

import java.util.Random;

public class Secede {
	private State[] state = new State[48];
	private Random rand = new Random();
	public Secede(){
		for(int i = 0; i < 48; i++)
			state[i] = StateHelper.getState(i);
	}
	public State getLeavingState(){
		boolean[] leave = new boolean[48];
		boolean done = false;
		int index = 48;
		while(!done){
			for(int i = 0; i < 48; i++)
				if(rand.nextInt(state[i].getSecedeProbability()) == 0)
					leave[i] = true;
			for(int i = 0; i < 48; i++)
				if(leave[i])
					done = true;
		}
		for(int i = 0; i < 48; i++)
			if(leave[i])
				index = i;
//		better code will come later
		return state[index];
	}
}
