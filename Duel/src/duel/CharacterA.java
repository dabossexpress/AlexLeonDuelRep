package duel;

public class CharacterA implements Dueler{
		//later: the taunt must be different each time the method is called		
		private int hp;
		private boolean load;
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
			load = false;
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
			if(!(caller instanceof Duel)) {
				return 3;
			}
			else {
					if(!load) {
						return 1;
					}
					else {
						if(this.hp > 75){
							return 1;
						}
						else {
							if(this.hp > 50) {
								if(Math.random() < .5) {
									return 1;
								}
								else {
									return 2;
								}
							}
							else {
								return 2;
							}
						}
					}
			}
		}
				
		
		
		//this method is called when you get hit. In the game, if you get hit, you lose 10 hp
		//this method body should only be executed if Object is an instance of Duel
		public void hit(Object caller) {
			if (caller instanceof Duel) {
			this.hp = this.hp-10;
			}
		}
}
