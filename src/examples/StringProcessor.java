package examples;

public class StringProcessor {
  public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
      "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
      "james;Derek James;james@gmail.com" + System.lineSeparator() +
      "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
      "gregory;Mike Gregory;gregory@yahoo.com";

  public static void main(String[] args) {
    System.out.println("===== Convert 1 demo =====");
    System.out.println(convert1(INPUT_DATA));

    System.out.println("===== Convert 2 demo =====");
    System.out.println(convert2(INPUT_DATA));

  }

  public static String convert1(String input) {
    String[] lines = input.split(System.lineSeparator());
    StringBuilder result = new StringBuilder();
    for (int i = 1; i < lines.length; i++) {
      String[] line = lines[i].split(";");
      for (int j = 0; j < line.length; j++) {
        if (j == 0 || j == 2) {
          result.append(line[j]);
        } else {
          result.append(" ==> ");
        }
      }
      result.append('\n');
    }
    return result.toString();
  }


  public static String convert2(String input) {
    String[] lines = input.split(System.lineSeparator());
    StringBuilder result = new StringBuilder();
    for (int i = 1; i < lines.length; i++) {
      String[] line = lines[i].split(";");
      for (int j = 1; j < line.length; j++) {
        if (j == 1) {
          result.append(line[j]);
        }
        if (j == 2) {
          result.append(" (email: ").append(line[j]).append(")");
        }
      }
      result.append("\n");
    }
    return result.toString();
  }

}
