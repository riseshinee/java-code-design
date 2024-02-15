package quarter.policypattern;

/**
 * 전략패턴 예시
 * 예시: 골드 회원 조건을 각각 클래스로 만들어서 한번에 모아서 체크하기
 */
public class GoldCustomerPolicy {
  private final ExcellentCustomerPolicy policy;

  GoldCustomerPolicy() {
    policy = new ExcellentCustomerPolicy();
    policy.add(new GoldCustomerPurchaseAmountRule()); //구매금액
    policy.add(new PurchaseFrequencyRule()); //구매 빈도
    policy.add(new ReturnRateRule()); //반품률
  }

  boolean complyWithAll(final PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
