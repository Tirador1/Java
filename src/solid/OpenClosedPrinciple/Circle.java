package solid.OpenClosedPrinciple;

class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(this.getRadius(), 2);
  }
}