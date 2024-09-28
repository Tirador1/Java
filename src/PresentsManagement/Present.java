package PresentsManagement;

import java.util.Arrays;

public class Present {
  Sweet[] sweets;

  public Present() {
    this.sweets = new Sweet[0];
  }

  public void addSweet(Sweet sweet) {
    if (sweet == null) return;
    Sweet[] newSweet = new Sweet[this.sweets.length + 1];
    System.arraycopy(this.sweets, 0, newSweet, 0, this.sweets.length);
    newSweet[this.sweets.length] = sweet;
    this.sweets = newSweet;
  }

  public double calculateTotalWeight() {
    double totalWeight = 0.0;
    for (Sweet sweet : this.sweets) {
      totalWeight += sweet.getWeight();
    }
    return totalWeight;
  }

  public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
                                          double maxSugarWeight) {
    return Arrays.stream(this.sweets).filter(sweet -> sweet.getSugarWeight() <= maxSugarWeight && sweet.getSugarWeight() >= minSugarWeight).toArray(Sweet[]::new);
  }

  public Sweet[] getSweets() {
    return this.sweets;
  }

  public void setSweets(Sweet[] sweets) {
    this.sweets = sweets;
  }

}