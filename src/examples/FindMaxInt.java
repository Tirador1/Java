package examples;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter integer numbers separated by space: ");
    String scanner = sc.nextLine();
    String[] strArray = scanner.split("\\s+");
    int[] intArray = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) {
      intArray[i] = Integer.parseInt(strArray[i]);
    }
    System.out.println("*** Initial Array ***");
    System.out.println(Arrays.toString(intArray));
    System.out.println("*** Max number in array ***");
    System.out.println(findMaxIntInArray(intArray));
  }


  public static int findMaxIntInArray(int[] intArray) {
    int max = intArray[0];
    for (int j : intArray) {
      if (max < j) {
        max = j;
      }
    }
    return max;
  }
}
