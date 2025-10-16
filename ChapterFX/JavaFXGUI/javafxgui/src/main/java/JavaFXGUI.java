/* JavaFXGUI.java
// Located in javafxgui/src/main/java/
// This requires a file called pom.xml
// in javafxgui/
// It should have been copied from the JavaFX code.
// A few values should be changed in pom.xml
// <artifactId></artfiactId> contents on line 5 should
// be changed from hellofx to javafxgui
// This changes where maven looks for main.
// <mainClass></mainClass> contents on line 34 should
// be changed from HelloFX to JavaFXGUI
// This changes what maven names the program's window.
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class JavaFXGUI extends Application {

  Group root = new Group();
  final Color DEFAULT_COLOR = Color.BLACK;
  final double DEFAULT_WIDTH = 1.0;

  public void start(Stage stage) {

    // writing text
    Text hello = text("Hello World", 50, 50);
    hello.setFont(Font.font("Helvetica", FontWeight.BOLD, 36));

    Text small = text("Example of small text\nthat spans multiple lines.", 25, 75);
    small.setFont(Font.font("Courier New", FontWeight.NORMAL, 12));

    Text sans_knock = text("Knock Knock.", 0, 120);
    sans_knock.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, 20));

    Text papyrus_there = text("Who's there?", 160, 160);
    papyrus_there.setFont(Font.font("Papyrus", FontWeight.THIN, 24));

    Text sans_dishes = text("Dishes.", 0, 180);
    sans_dishes.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, 20));

    Text papyrus_who = text("Dishes who?", 160, 220);
    papyrus_who.setFont(Font.font("Papyrus", FontWeight.THIN, 24));

    Text sans_joke = text("Dishes a bad joke.", 0, 240);
    sans_joke.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM, 20));

    // drawRect(25, 25, 100, 50);
    // drawCircle(200,125,25);
    // drawRect(200, 200, 50, 50, Color.WHITE);
    // drawCircle(100, 200, 100, Color.ALICEBLUE);

    // change title of this instance of the window that will open
    stage.setTitle("Draw Text");
    stage.getIcons().add(new Image("file:coffee-cup-silhouette-optimized.png"));//https://freefavicon.com/freefavicons/food/iconinfo/coffee-cup-silhouette-optimized-152-238538.html
    stage.setScene(new Scene(root, 300, 300));
    stage.show();
  }

  public static void main(String[] args) {
      launch();
  }

  public Text text(String str, int x, int y) {
    Text text = new Text(str);
    text.setX(x);
    text.setY(y);
    text.setFocusTraversable(true); // can highlight
    root.getChildren().add(text);
    return text;
  }

  public Rectangle drawRect(int x, int y, int w, int h) {
    return drawRect(x, y, w, h, DEFAULT_COLOR);
  }

  public Rectangle drawRect(int x, int y, int w, int h, Color c) {
    Rectangle rect = new Rectangle(x, y, w, h);
    rect.setFill(c);
    rect.setStroke(DEFAULT_COLOR);
    rect.setStrokeWidth(DEFAULT_WIDTH);
    root.getChildren().add(rect);
    return rect;
  }

  public Circle drawCircle(int x, int y, int r) {
    return drawCircle(x, y, r, DEFAULT_COLOR);
  }

  public Circle drawCircle(int x, int y, int r, Color c) {
    Circle circle = new Circle(x, y, r);
    circle.setFill(c);
    circle.setStroke(DEFAULT_COLOR);
    circle.setStrokeWidth(DEFAULT_WIDTH);
    root.getChildren().add(circle);
    return circle;
  }
}

// to build, you'll run
// mvn clean javafx:run
