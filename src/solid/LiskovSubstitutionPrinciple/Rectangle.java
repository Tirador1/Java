package solid.LiskovSubstitutionPrinciple;

public class Rectangle extends Shape {
  public Rectangle(int width, int height) {
    super(width, height);
  }

  @Override
  public int calculateArea() {
    return width * height;
  }
}