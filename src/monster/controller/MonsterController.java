package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{

	private MarshmallowMonster flirp;
	private Scanner inputReader;

	public MonsterController()
	{
		flirp = new MarshmallowMonster("Flirp", 2, false, 1, 2, 2);
		inputReader = new Scanner(System.in);
		/*
		 * name = "Flirp" legCount = 2 Belly button = false noses = 1 eyes = 2
		 */
	}

	public void start()
	{
		nameChanger();
		System.out.println("My monster's name is " + flirp.getName());
		if (flirp.getHasBellyButton() == true)
		{
			System.out.println("My monster has a bellybutton.");
		}
		else
		{
			System.out.println("My monster has no bellybutton.");

		}
		
	}
	
	public void nameChanger(){
		System.out.println("What should the name of our monster be?");
		String name = inputReader.nextLine();
		System.out.println("The old name is: " + flirp.getName() + " The new name is: " + name);
		flirp.setName(name);
		inputReader.nextLine();
		
	}
}
