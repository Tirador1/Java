package PresentsManagement;

public abstract class Cookie extends Sweet {
  double doughWeight;

  public Cookie(String name, double weight, double sugarWeight) {
    super(name, weight, sugarWeight);
  }

  public Cookie() {
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

  public double getDoughWeight() {
    return doughWeight;
  }

  public void setDoughWeight(double doughWeight) {
    this.doughWeight = doughWeight;
  }
}
