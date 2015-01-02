package com.crazyfundu.github.algorithmsolutions.moderate;

import java.util.ArrayList;
import java.util.List;
/**
 * The Game of Master Mind is played as follows:
The computer has four slots containing balls that are red (R), yellow (Y), green (G) or
blue (B)  For example, the computer might have RGGB (e g , Slot #1 is red, Slots #2 and
#3 are green, Slot #4 is blue) 
You, the user, are trying to guess the solution  You might, for example, guess YRGB 
When you guess the correct color for the correct slot, you get a “hit”  If you guess
a color that exists but is in the wrong slot, you get a “pseudo-hit”  For example, the
guess YRGB has 2 hits and one pseudo hit 
For each guess, you are told the number of hits and pseudo-hits 
Write a method that, given a guess and a solution, returns the number of hits and
pseudo hits
 * @author AvneeshS1
 *
 */
public class GameOfMasterMind {
	static int hits;
	static int pHits;
	public static void main(String[] args) {
		check("RGGB", "RGGB");
	}
	
	public static void check(String sorts, String guess){
		int stringMask =0;
		for (int i = 0; i < 4; i++) {
			stringMask |= 1 << (1+guess.charAt(i)-'A');
		}
		
		for (int i = 0; i < 4; i++) {
			if(guess.charAt(i) == sorts.charAt(i)){
				hits++;
			}else if((stringMask & (1<<sorts.charAt(i)-'A')) >= 1){
				pHits++;
			}
		}

		System.out.println(hits);
		System.out.println(pHits);
		
		
	}
}