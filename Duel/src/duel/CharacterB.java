package duel;

public class CharacterB implements Dueler{
	private int hp;
	private boolean loaded;
	public CharacterB() {
		
	}

	public String getName(){
		return "Sid";
	}
	public void taunt() {
		System.out.println("You're a mistake");
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
		loaded = false;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP()==hp)
		return true;
		else
		return false;
		
	}
	public int getAction(Object caller) {
		
			/*if(!(caller instanceof Duel))
			{
				return 3;
			}
			else
			{
				if (this.hp>50)
				{
					if (!loaded)
					{
						return 0;
					}
					else
					{
						return 1;
					}
				}
				else
				{
					if(Math.random()<0.5)
					{
						if (!loaded)
						{
							return 0;
						}
						else
						{
							return 1;
						}
					}
					else
					{
						return 2;
					}
				}
			}
	}*/
		if(!(caller instanceof Duel))
		{
			return 3;
		}
		else
		{
				if (!loaded)
				{
					loaded = !loaded;
					return 0;
				}
				if(Math.random()<0.5 && loaded == true)
				{
						loaded = false;
						return 1;
					}
				else
				{
					return 2;}}}

	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp = this.hp-10;
		}
		
	}
}