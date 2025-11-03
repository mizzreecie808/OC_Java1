/*
Write a method called stripComments that accepts a Scanner representing an input file
containing a Java program as its parameter, reads that file, and then prints the file’s
text with all comments removed.
Possibilities
/1/
... /2/
... /* 3 */
/* 4
.........*/

import java.io.*;
import java.util.*;

public class C06E13_stripComments {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "comments.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    stripComments(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void stripComments(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // track if we are inside a /* */ comment
    boolean inBlockComment = false;

    // read each line
    while (input.hasNextLine()) {
      String line = input.nextLine();
      String outputLine = "";

      // track currIndex character index
      int currIndex = 0;

      // process line fragments
      while (currIndex < line.length()) {

        if (inBlockComment) {
          // STATE 1 We are inside a block comment, look for "*/"
          int blockEnd = line.indexOf("*/", currIndex);

          if (blockEnd != -1) {
            // found the end: skip the comment text
            currIndex = blockEnd + 2; // move index pas the "*/"
            inBlockComment = false; // block comment ends
            // loop continues to process the rest of the line
          } else {
            // end not found on this line. discard the rest of the line
            currIndex = line.length();
          }
        } else {
          // STATE 2 We are outside a comment, look for "/*" or "//"
          int blockStart = line.indexOf("/*", currIndex);
          int lineStart = line.indexOf("//", currIndex);

          int commentStart;

          // determine the index of the comment that appears first (lowest index)
          if (blockStart != -1 && (lineStart == -1 || blockStart < lineStart)) {
            commentStart = blockStart;  // /* is the first
          } else if (lineStart != -1) {
            commentStart = lineStart;   // // is the first
          } else {
            commentStart = -1;  // no comments on the rest of the line
          }

          if (commentStart != -1) {
            // 1. print the code BEFORE the comment begins
            outputLine += line.substring(currIndex, commentStart);
            currIndex = commentStart; // move position to the start of the comment

            if (currIndex == blockStart) {
              // block comment found: change state, skip the /*
              inBlockComment = true;
              currIndex += 2; // skip "/*"
              // loop continues (now in block comment state, looking for */)
            } else {
              // line comment: done with the line
              currIndex = line.length();
            }
          } else {
            // no comment found: append the rest of the line and finish processing
            outputLine += line.substring(currIndex);
            currIndex = line.length();
          }
        }
      } // end of inner while loop
      // print the clean processed line
      IO.println(outputLine);
    }
  }
}
