package duel;

public class CharacterB implements Dueler{
	private int hp;
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
		if (caller != this)
			return 0;
		else
			// to be edited later
			return 0;
	}

	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp = this.hp-10;
		}
		
	}
}