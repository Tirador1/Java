package solid.LiskovSubstitutionPrinciple;

public abstract class Shape {
  protected int width;
  protected int height;

  Shape(int width, int height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  public void setWidth(int width) throws IllegalArgumentException {
    if (width < 0) {
      throw new IllegalArgumentException();
    }
    this.width = width;
  }

  public void setHeight(int height) {
    if (height < 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
  }

  public abstract int calculateArea();
}