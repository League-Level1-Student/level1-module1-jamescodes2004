package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar s = new RaceCar("Shell", 5);
s.getPositionInRace();
		
		// 4. If the car is damaged. Bring it in for a pit stop.
s.crash();
		// 5. Help the car move into first place.
s.pit();
s.overtake();
s.overtake();
s.overtake();
s.overtake();
s.overtake();
s.overtake();
s.overtake();
s.overtake();

	}
}
