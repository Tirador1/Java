package examples;

import java.util.Arrays;
import java.util.Scanner;
public class EmptyRectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter height of rectangle: ");
    int height = sc.nextInt();
    System.out.print("Please, enter width of rectangle: ");
    int width = sc.nextInt();

    drawRectangle(height, width);
  }

  public static void drawRectangle(int height, int width) {
    char[][] rectangle = new char[height][width];
    for (int i = 0; i < height; i++) {
      Arrays.fill(rectangle[i], '*');
    }
    for(int i = 1; i < height - 1; i++) {
      for(int j = 1; j < width - 1; j++) {
        rectangle[i][j] = ' ';
      }
    }

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(rectangle[i][j]);
      }
      System.out.println();
    }
  }
}
