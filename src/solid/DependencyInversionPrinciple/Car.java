package solid.DependencyInversionPrinciple;

public class Car {
  private Engine engine;

  Car(Engine engine) {
  }

  void start() {
    this.engine.start();
  }
}