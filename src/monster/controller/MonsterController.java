package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{

	private MarshmallowMonster flirp;

	public MonsterController()
	{
		flirp = new MarshmallowMonster("Flirp", 2, false, 1, 2, 2);

		/*
		 * name = "Flirp" legCount = 2 Belly button = false noses = 1 eyes = 2
		 */
	}

	public void start()
	{
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
}
