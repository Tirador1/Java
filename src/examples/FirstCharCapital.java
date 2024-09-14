package examples;

import java.util.Scanner;

public class FirstCharCapital {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter any text: ");
    String userInput = sc.nextLine();


    System.out.println(firstCharToTitleCase(userInput));
  }

  public static String firstCharToTitleCase(String string) {
    String lower = string.toLowerCase();
    char[] lowerArr = lower.toCharArray();
    lowerArr[0] = Character.toUpperCase(lowerArr[0]);
    for (int i = 1; i < lowerArr.length; i++) {
      boolean found = Character.isLetter(lowerArr[i]) && Character.isWhitespace(lowerArr[i - 1]);
      if (found) {
        lowerArr[i] = Character.toUpperCase(lowerArr[i]);
      }

    }
    return String.valueOf(lowerArr);
  }
}
