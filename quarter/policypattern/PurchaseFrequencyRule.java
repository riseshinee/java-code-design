package quarter.policypattern;
public class PurchaseFrequencyRule implements ExcellentCustomerRule {
  @Override
  public boolean ok(PurchaseHistory history) {
    return history.returnRate <= 0.001;
  }
}
