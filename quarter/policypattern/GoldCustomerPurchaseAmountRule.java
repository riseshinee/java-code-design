package quarter.policypattern;

/**
 * 골드 회원 구매 금액 규기
 */
public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule{
  @Override
  public boolean ok(PurchaseHistory history) {
    return 1000000 <= history.totalAmount;

  }
}
