package examples;

import java.util.Scanner;

public class ConvertDecimalToRoman {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    mainLoop:
    while (true) {
      System.out.print("Please, select mode. If you want to convert Roman "
          + "numbers to decimal - type 'R2D' and press enter."
          + System.lineSeparator()
          + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

      String mode = sc.next();
      if (mode.equalsIgnoreCase("R2D")) {
        while (true) {
          System.out.print("Please, enter Roman number you want to convert: ");
          String romanNumber = sc.next().toUpperCase();
          if (isRomanNumberValid(romanNumber)) {
            System.out.println(roman2Decimal(romanNumber));
            break mainLoop;
          } else {
            System.out.println("You entered an invalid Roman number. "
                + "Please, try one more time.");
          }
        }
      } else if (mode.equalsIgnoreCase("D2R")) {
        while (true) {
          System.out.print("Please, enter decimal number "
              + "you want to convert: ");
          int decimalNumber = sc.nextInt();
          if (isDecimalNumberValid(decimalNumber)) {
            System.out.println(decimal2Roman(decimalNumber));
            break mainLoop;
          } else {
            System.out.println("Please, enter a positive integer from 1 to 100.");
          }
        }
      } else {
        System.out.println("Please, enter 'R2D' or 'D2R'.");
      }
    }
    sc.close();
  }

  /**
   * Converts decimal numbers to Roman.
   * <p>
   * Takes int value as a parameter. Works only with numbers from 1 to 100.
   *
   * @param number to convert to Roman.
   * @return string of Roman number.
   */
  public static String decimal2Roman(int number) {
    int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanSymbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    StringBuilder romanNumber = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      while (number >= values[i]) {
        romanNumber.append(romanSymbols[i]);
        number -= values[i];
      }
    }
    return romanNumber.toString();
  }

  /**
   * Converts Roman numbers to decimal.
   * <p>
   * Takes string value with Roman number as a parameter.
   *
   * @param romanNumber Roman number string to convert.
   * @return decimal representation of Roman number
   */
  public static int roman2Decimal(String romanNumber) {
    int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanSymbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    int decimal = 0;
    int i = 0;

    while (romanNumber.length() > 0) {
      String symbol = romanSymbols[i];
      if (romanNumber.startsWith(symbol)) {
        decimal += values[i];
        romanNumber = romanNumber.substring(symbol.length());
      } else {
        i++;
      }
    }
    return decimal;
  }

  /**
   * Validation for Roman numbers.
   * <p>
   * Use regular expression which is checking if string could be Roman number.
   *
   * @param romanNumber Roman number string to validate.
   * @return true if valid Roman number
   */
  public static boolean isRomanNumberValid(String romanNumber) {
    return romanNumber.matches("^(C|XC|L|XL|X|IX|V|IV|I)+$");
  }

  /**
   * Validation for decimal numbers.
   * <p>
   * Checks if the decimal number is between 1 and 100 inclusive.
   *
   * @param decimalNumber Decimal number to validate.
   * @return true if the number is within the valid range
   */
  public static boolean isDecimalNumberValid(int decimalNumber) {
    return decimalNumber >= 1 && decimalNumber <= 100;
  }
}
