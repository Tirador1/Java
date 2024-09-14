package examples;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter any words separated by space: ");
    String userInput = sc.nextLine();
    System.out.print("Please, enter minimum word length to filter words: ");
    int minLength = sc.nextInt();

    String[] words = userInput.split("\\s+");
    String[] filteredWords = filterWordsByLength(minLength, words);
    System.out.println(Arrays.toString(filteredWords));
  }


  public static String[] filterWordsByLength(int minLength, String[] words) {
    int j = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= minLength) {
        j++;
      }
    }
    String[] filteredArray = new String[j];
    j = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= minLength) {
        filteredArray[j] = words[i];
        j++;
      }
    }
    return filteredArray;
  }
}