package PresentsManagement;

public class Oreo extends Cookie {
  public Oreo(String name, double weight, double sugarWeight) {
    super(name, weight, sugarWeight);
  }

  public Oreo() {
    super();
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public double getWeight() {
    return super.getWeight();
  }

  @Override
  public void setWeight(double weight) {
    super.setWeight(weight);
  }

  @Override
  public double getSugarWeight() {
    return super.getSugarWeight();
  }

  @Override
  public void setSugarWeight(double sugarWeight) {
    super.setSugarWeight(sugarWeight);
  }
}
