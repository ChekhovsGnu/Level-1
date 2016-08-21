public class Wizard {

	private boolean cloakOn;
	
	Wizard() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is now invisible");
		else
			System.out.println("Harry is now visible");
	}

	void spyOnSnape() {
		if (cloakOn)
		System.out.println("Harry sees Professor Snape doing nefarious things.");
		else 
			System.out.println("Harry Potter would be caught!");
	}
	public static void main(String[] args) {
		// 1. make harry potter
		Wizard HarryPotter = new Wizard();
		// 2. become invisible
		HarryPotter.spyOnSnape();
		HarryPotter.makeInvisible(true);
		// 3. spy on professor snape
		HarryPotter.spyOnSnape();
		// 4. become visible again
		HarryPotter.makeInvisible(false);
		// 5. cast a “stupefy” spell
		HarryPotter.castSpell("Stupefy!");
	}

}
