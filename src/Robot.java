public class Robot {
	private int numberOfWheels;
	private Knife knife;
	private String name;
	private boolean isEvil;

	void destroyHumanity() {
		if (isEvil == true) {
			System.out.println("Humanity status = Destroyed by " + name);
		} else {
			System.out.println("No thank you! " + name + " likes humanity :)");
		}
	}

	public Robot(boolean evil, String n) {
		numberOfWheels = 4;
		knife = new Knife();
		name = n;
		isEvil = evil;
	}

	class Knife {
		double sharpness;

		public Knife() {
			sharpness = 0.987;
		}
	}
}