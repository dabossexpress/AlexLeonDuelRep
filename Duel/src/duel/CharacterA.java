package duel;

public class CharacterA implements Dueler{
		//later: the taunt must be different each time the method is called		
		public void taunt() {
			System.out.println("I'm taunting you. Ha.");
		}
		
		public String getName() {
			return "Alex";
		}
		
		//Students complete these two methods at the same time
		//set the value of a field. Write this in such a way that it can only be called once (by the Duel, at the start)
		public void setStartingHP(int hp) {
			this.hp = hp;
		}
		public int getHP() {
			return hp;
		}
		
		//This method is called by the Duel and can be used by the dueler
		//return true if d has hp of given level
		public boolean determineIfOpponentIsFair(Dueler d, int hp) {
			if(d.getHP()==hp) {
				return true;
				}
			else {
				return false;
			}
		}
		
		//return the action chosen for this round
		//Object is the object calling this method. Use it to verify your opponent is not trying to gain the upperhand by figuring out what you are doing.
		public int getAction(Object caller) {
			
		}
		
		
		//this method is called when you get hit. In the game, if you get hit, you lose 10 hp
		//this method body should only be executed if Object is an instance of Duel
		public void hit(Object caller) {
			if (caller instanceof Duel) {
			this.hp = this.hp-10;
			}
		}
}
