package solid.InterfaceSegregationPrinciple;

public class Employee implements Workable, Eatable, Sleepable {
  @Override
  public void work() {
    Workable.super.work();
    System.out.println("Employee is working");
  }

  @Override
  public void eat() {
    Eatable.super.eat();
    System.out.println("Employee is Eating");
  }

  @Override
  public void sleep() {
    Sleepable.super.sleep();
    System.out.println("Employee is Sleeping");
  }
}