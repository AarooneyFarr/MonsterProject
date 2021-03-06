package monster.model;

public class MarshmallowMonster
{

	private String name;
	private double legCount;
	private boolean hasBellyButton;
	private int eyes;
	private int arms;
	private int noses;

	public MarshmallowMonster()
	{
		this.name = "Flirp";
		this.legCount = 2;
		this.hasBellyButton = false;
		this.noses = 1;
		this.arms = 2;
		this.eyes = 2;
	}

	public MarshmallowMonster(String name, double legCount, boolean hasBellyButton, int noses, int arms, int eyes)
	{

		this.name = name;
		this.legCount = legCount;
		this.hasBellyButton = hasBellyButton;
		this.noses = noses;
		this.arms = arms;
		this.eyes = eyes;

		/*
		 * My name is Flirp I have two legs I have no belly button I have one
		 * nose I have two eyes
		 */
	}

	public String toString()
	{
		String description = "Name is " + this.name;
		return description;
	}

	/*
	 * name = "Flirp" legCount = 2 Belly button = false noses = 1 arms = 2 eyes
	 * = 2
	 */
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getLegCount()
	{
		return legCount;
	}

	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}

	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}

	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}

	public int getNoses()
	{
		return noses;
	}

	public void setNoses(int noses)
	{
		this.noses = noses;
	}

	public int getArms()
	{
		return arms;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public int getEyes()
	{
		return eyes;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
}
