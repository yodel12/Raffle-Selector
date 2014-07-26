package mabinogi.scripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Raffle {

	public static void main(String[] args) throws FileNotFoundException
	{
		/**
		 * Gets the list of names entered into a raffle
		 */
		Scanner scan = new Scanner(new File("raffle.txt"));
		ArrayList<String> names = new ArrayList<>();
		while(scan.hasNextLine())
		{
			names.add(scan.nextLine());
		}
		scan.close();
		
		/**
		 * Gets the prizes for the raffle
		 */
		Scanner scn = new Scanner(new File("prizes.txt"));
		ArrayList<String> prizes = new ArrayList<>();
		while(scn.hasNextLine())
		{
			prizes.add(scn.nextLine());
		}
		scn.close();
		
		/**
		 * Selects one person for each prize if prizes < people.
		 */
		Random choose = new Random();
		for(int i = 0; i < prizes.size(); i++)
		{
			
			int index = choose.nextInt(names.size());
			String name = names.remove(index);
			System.out.println("Prize: " + prizes.get(i) + "\tName: " + name);
		}
		
		/**
		 * To improve:
		 * 
		 * What happens when there are more people than there
		 * are prizes.
		 */
	}
}
