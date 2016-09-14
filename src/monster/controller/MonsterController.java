package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{

	private MarshmallowMonster flirp;

	public MonsterController()
	{
		flirp = new MarshmallowMonster("Flirp", 2, false, 1, 2);

		/*
		 * name = "Flirp" legCount = 2 Belly button = false noses = 1 eyes = 2
		 */
	}

	public void start()
	{
		System.out.println("Here is my MONSTER: ", flirp);
	}
}
