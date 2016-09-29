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

		changer();
		loopMonster();

	}

	public void changer()
	{
		System.out.println("What do you want to change?");
		String changeCheck = inputReader.nextLine();
		if (changeCheck.equalsIgnoreCase("name"))
		{
			nameChanger();
		}
		else if (changeCheck.equalsIgnoreCase("number of legs"))
		{
			legChanger();
		}
		else if (changeCheck.equalsIgnoreCase("number of arms"))
		{
			armChanger();
		}
		else if (changeCheck.equalsIgnoreCase("number of noses"))
		{
			noseChanger();
		}
		else if (changeCheck.equalsIgnoreCase("number of eyes"))
		{
			eyesChanger();
		}
		else if (changeCheck.equalsIgnoreCase("nothing"))
		{
			System.out.println("Fine!");
		}
		else
		{
			System.out.println("Your choices for things to change are: name, number of legs, number of arms, number of noses, and number of eyes.");
			changer();
		}
	}

	public void nameChanger()
	{
		System.out.println("What should the name of our monster be?");
		String name = inputReader.nextLine();
		System.out.println("The old name is: " + flirp.getName() + " The new name is: " + name);
		flirp.setName(name);
		inputReader.nextLine();

	}

	public void noseChanger()
	{
		System.out.println("How many noses should our monster have?");
		int nose = inputReader.nextInt();
		System.out.println("The new number of noses is:" + nose);
		flirp.setNoses(nose);
		inputReader.nextLine();

	}

	public void legChanger()
	{
		System.out.println("How many legs should " + flirp.getName() + " have?");
		double leg = inputReader.nextDouble();
		System.out.println("The new number of legs is: " + leg);
		flirp.setLegCount(leg);
		inputReader.nextLine();

	}

	public void armChanger()
	{
		System.out.println("How many arms should our monster have?");
		int arms = inputReader.nextInt();
		System.out.println("The new number of arms is: " + arms);
		flirp.setArms(arms);
		inputReader.nextLine();

	}

	public void eyesChanger()
	{
		System.out.println("How many eyes should our monster have?");
		int eyes = inputReader.nextInt();
		System.out.println("The new number of eyes is: " + eyes);
		flirp.setEyes(eyes);
		inputReader.nextLine();

	}

	private void loopMonster()
	{
		int test = 0;
		while (test <= 10)
		{
			System.out.print("First Monser Words " + flirp);
			test++;
		}
	}

}
