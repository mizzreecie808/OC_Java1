/*
Write a method called doubleSpace that accepts a Scanner for an input file and a
PrintStream for an output file as its parameters, writing into the output file a
double-spaced version of the text in the input file. You can achieve this task by
inserting a blank line between each line of output.
*/

import java.io.*;
import java.util.*;

public class C06E08_doubleSpace {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File inputFile = new File(directory, "flip.txt");

    // check the file exists
    if (!inputFile.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance (input)
    Scanner fileScanner = new Scanner(inputFile);

    // 2. Create the output file
    File outputFile = new File(directory, "double_space.txt");

    // 3. Create the PrintStream instance (output stream)
    PrintStream outputStream = new PrintStream(outputFile);

    // 4. Pass both streams to the method
    doubleSpace(fileScanner, outputStream);

    // 5. Close the streams
    fileScanner.close();
    outputStream.close();

  }

  // - 6.9 doubleSpace max 60 characters per line
  public static void doubleSpace(Scanner input, PrintStream output) {

    // check for null input
    if (input == null || output == null) {
      throw new IllegalArgumentException("Input or output streams cannot be null.");
    }

    while (input.hasNextLine()) {
      String line = input.nextLine();

      // print the content
      output.println(line);

      // add the blank line
      output.println();
    }
  }
}
