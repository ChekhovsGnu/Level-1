import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		int score = 0;
		String monsLink = "https://img.grouponcdn.com/deal/5EXVDNMDEe1mtyEK6Pgp/ZC-1057x634/v1/c700x420.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component monsPicture;
		// 3. use the "createImage()" method below to initialize your Component
		monsPicture = createImage(monsLink);
		// 4. add the image to the quiz window
		quizWindow.add(monsPicture);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String monsAnswer = JOptionPane.showInputDialog("What is this in latin? (Nominative singular)");
		if (monsAnswer.equalsIgnoreCase("mons")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(monsPicture);

		// 10. find another image and create it (might take more than one line of code)
		String aquaLink = "http://justbettercare.com/site/wp-content/uploads/2015/10/water-fb.png";
		Component aquaPicture;
		aquaPicture = createImage(aquaLink);

		// 11. add the second image to the quiz window
		quizWindow.add(aquaPicture);

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String aquaAnswer = JOptionPane.showInputDialog("What is this in latin? (Nominative Singular)");
		if (aquaAnswer.equalsIgnoreCase("aqua")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		quizWindow.remove(aquaPicture);
		Component canisPicture;
		String canisLink = "https://s-media-cache-ak0.pinimg.com/564x/0e/85/af/0e85afe7f50e7e535bf47ad93e516512.jpg";
		canisPicture = createImage(canisLink);
		quizWindow.add(canisPicture);
		quizWindow.pack();
		String canisAnswer = JOptionPane.showInputDialog("What is this in latin? (Nominative Singular)");
		if (canisAnswer.equalsIgnoreCase("canis")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "You scored " + score + " points!");
		// 14+ check answer, say if correct or incorrect, etc.
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
