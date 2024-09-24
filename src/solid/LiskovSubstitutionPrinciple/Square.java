package solid.LiskovSubstitutionPrinciple;

public class Square extends Shape {
  public Square(int width) {
    super(width, width);
  }

  @Override
  public int calculateArea() {
    return width * height;
  }
}