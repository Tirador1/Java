package solid.DependencyInversionPrinciple;

public class GasolineEngine implements Engine {
  @Override
  public void start() {
    System.out.println("Gasoline Engine started.");
  }
}
