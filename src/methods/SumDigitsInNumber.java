package methods;

import java.util.Scanner;

public class SumDigitsInNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter integer: ");
    int number = sc.nextInt();

    int sumOfDigits = sumDigitsInNumber(Math.abs(number));
    System.out.println(sumOfDigits);
  }

  public static int sumDigitsInNumber(int number) {
    int sum = 0;
    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }
}