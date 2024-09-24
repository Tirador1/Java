package solid.InterfaceSegregationPrinciple;

public class Robot implements Workable {
  @Override
  public void work() {
    Workable.super.work();
    System.out.println("Robot is working");
  }
}