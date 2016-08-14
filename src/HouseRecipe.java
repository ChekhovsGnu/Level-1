import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class HouseRecipe {
	public static void main(String[] args) {
		Tortoise.getBackgroundWindow().setColor(Color.black);
		Tortoise.setX(10);
		Tortoise.setY(400);
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setPenWidth(5);
		String randomHeight = "null";
		String randomColor = "null";
		String randomRoof = "null";
		for (int i = 0; i < 50; i++) {
			int r = new Random().nextInt(4);
			int r2 = new Random().nextInt(5);
			int r3 = new Random().nextInt(10);
			if (r == 1) {
				randomHeight = "small";
			}
			if (r == 2) {
				randomHeight = "medium";
			}
			if (r == 3) {
				randomHeight = "large";
			}
			if (r2 == 1) {
				randomColor = "blue";
			}
			if (r2 == 2) {
				randomColor = "white";
			}
			if (r2 == 3) {
				randomColor = "red";
			}
			if (r2 == 4) {
				randomColor = "pink";
			}
			if (r3 == 1) {
				randomRoof = "peaked";
			} else {
				randomRoof = "null";
			}
			drawHouse(randomHeight, randomColor, randomRoof);
		}
	}

	static void drawHouse(String height, String color, String roof) {
		int Height = 0;
		if (height.equals("small")) {
			Height = 60;
		}
		if (height.equals("medium")) {
			Height = 120;
		}
		if (height.equals("large")) {
			Height = 250;
		}
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		}
		if (color.equals("white")) {
			Tortoise.setPenColor(Color.WHITE);
		}
		if (color.equals("pink")) {
			Tortoise.setPenColor(Color.pink);
		}
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		}
		Tortoise.move(Height);
		if (roof.equals("peaked")) {
			drawPointRoof();
		} else {
			drawFlatRoof();
		}
		Tortoise.move(Height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(20);
		Tortoise.turn(-90);
	}

	static void drawPointRoof() {
		Tortoise.turn(45);
		Tortoise.move(15);
		Tortoise.turn(90);
		Tortoise.move(15);
		Tortoise.turn(45);
	}

	static void drawFlatRoof() {
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(90);
	}
}
