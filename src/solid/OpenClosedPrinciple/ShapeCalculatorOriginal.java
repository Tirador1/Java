package solid.OpenClosedPrinciple;

import java.util.List;

/*

In this file you can find violation of Open / Closed Principle.
You should refactor this file.
You can remove this file completely, because it will not be used during the evaluation of the solution.

*/

public class ShapeCalculatorOriginal {
  public double calculateTotalArea(List<Shape> shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
      if (shape instanceof Circle circle) {
        totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
      } else if (shape instanceof Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
      }
    }
    return totalArea;
  }
}

class ShapeOriginal {
}

class CircleOriginal extends ShapeOriginal {
  private double radius;

  public void Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}

class RectangleOriginal extends ShapeOriginal {
  private double width;
  private double height;

  public void Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }
}