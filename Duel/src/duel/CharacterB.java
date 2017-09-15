package duel;

public class CharacterB implements Dueler{
	private int hp;
	public CharacterB() {
		
	}

	public String getName(){
		return "Sid";
	}
	public void taunt() {
		System.out.println("You're a mistake.");
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
}
