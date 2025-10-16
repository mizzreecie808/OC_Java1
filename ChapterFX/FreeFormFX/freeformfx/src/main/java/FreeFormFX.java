/*
This program is a palindrome checker.
Takes a user input via scanner console then checks if its a palindrome
or not.
The output is a graphic of either a YAY or a SORRY stating the
word the user inputted and whether or not it is a palindrome.
Requires the following:
1) Use parameters
2) At least one method with multiple parameters
3) Return values
4) If/Else statements
5) Graphics
6) At least two types of variables
7) At least one for loop
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import java.util.Scanner;

public class FreeFormFX extends Application {

  static String userWord = "";
  static boolean isPalindromeResult = false;

  // standar javaFX fields
  Group root = new Group();
  final Color DEFAULT_COLOR = Color.BLACK;
  final double DEFAULT_WIDTH = 1.0;

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    IO.print("Which word would you like to check? (note: case doesn't matter) ");
    userWord = console.nextLine();

    isPalindromeResult = isPalindrome(userWord);
    // this is for the console portion
    if (isPalindromeResult) {
      IO.println("Yes, " + userWord + " is a Palindrome.");
    } else {
      IO.println("No, " + userWord + " is not a Palindrome.");
    }

    console.close();
    launch(args);

  }

  // method to reverse the user word
  public static boolean isPalindrome(String word) {
    String reversed = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reversed += word.charAt(i);
    }

    return word.toLowerCase().equals(reversed.toLowerCase());
  }

  // javafx entry point
  public void start(Stage stage) {

    String displayText;
    String imageFileName;

    if (isPalindromeResult) {
      displayText = "Yes, " + userWord + "\nis a Palindrome";
      imageFileName = "/yay.jpg";

    } else {
      displayText = "Sorry, " + userWord + "\nis NOT a Palindrome";
      imageFileName = "/sorry.jpg";
    }

    ImageView resultImage = image(imageFileName, 50, 50, 200);
    Text resultText = text(displayText, 50, 210);
    resultText.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 24));

    // stage setup
    stage.setTitle("Palindrome Checker");
    stage.setScene(new Scene(root, 300, 300));
    stage.show();
  }

  // method to draw text
  public Text text(String str, int x, int y) {
    Text text = new Text(str);
    text.setX(x);
    text.setY(y);
    text.setFocusTraversable(true);
    root.getChildren().add(text);
    return text;
  }

  // method to show image
  public ImageView image(String fileName, int x, int y, int w) {
    Image image = new Image(getClass().getResourceAsStream(fileName));
    ImageView imageView = new ImageView(image);

    // set x, y location
    imageView.setX(x);
    imageView.setY(y);

    // resize image to fix 300 x 300 window
    imageView.setFitWidth(w);

    // keeps image from stretching
    imageView.setPreserveRatio(true);

    root.getChildren().add(imageView);
    return imageView;
  }
}
