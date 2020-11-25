package first;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class HangMan {
	
	public static ArrayList<String> selectedWord = new ArrayList<String>();
	public static ArrayList<String> subtractedLetter = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("bro");
		words.add("nuts");
		words.add("beans");
		words.add("triple");
		words.add("potatos");
		ArrayList<String> yes = new ArrayList<String>();	
			
		Random r = new Random();
		int nxi = r.nextInt(5);
		
		System.out.println("Sup victim, guess the word! It is " + words.get(nxi).length() + " letters long!");
		
		Scanner wordIn = new Scanner(System.in);
			
		String[] xyz = words.get(nxi).split("");			//these 3 lines of code takes the random word and splits it by each letter
			for(int a = 0; a <= xyz.length - 1; a++) {		//and adds each letter to the selectedWord array list
				selectedWord.add(xyz[a]);
		}
	
	while(selectedWord.size() != 0) {       //giant while loop where everything happens.
		String typedWord = wordIn.nextLine();
		String[] abc = typedWord.split("");
		
		
	for(int c = 0; c <= typedWord.length() - 1; c++) {  //This for & if statement detects if the victim inputed an incorrect letter
		if (!selectedWord.contains(abc[c])) 	{
			System.out.println("Wrong! You have either already guessed this letter or it is not found in the word! You still have " + selectedWord.size() + " letters left!");
				}
			}
		
	for(int b = 0; b <= typedWord.length() - 1; b++) {	
		if (selectedWord.contains(abc[b])) {		//This if statement detects if a correct letter is inputed
			yes.add(abc[b]);
			selectedWord.removeAll(yes);
			subtractedLetter.add(abc[b]);
			System.out.println("Correct! You still have " + selectedWord.size() + " letters left!");
		}
	}	
		if (selectedWord.size() == 0) {		//This if statement is for when the victim has guessed all of the correct letters
			System.out.println("Congratulations! You have guessed the word! Now back to the dungeon you go.");	
		}
	}
		wordIn.close();
	}
}
	

			
		
