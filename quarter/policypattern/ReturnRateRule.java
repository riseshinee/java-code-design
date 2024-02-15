package quarter.policypattern;

/**
 * 구매 빈도 규칙
 */
public class ReturnRateRule implements ExcellentCustomerRule{
  @Override
  public boolean ok(PurchaseHistory history) {
    return history.returnRate <= 0.001;
  }
}
