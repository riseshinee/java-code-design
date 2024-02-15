package quarter.policypattern;

public class SilverCustomerPolicy {
  //규칙 재사용
  private final ExcellentCustomerPolicy policy;

  SilverCustomerPolicy() {
    policy = new ExcellentCustomerPolicy();
    //실버 회원 구매금액 체크 클래스 추가
    policy.add(new PurchaseFrequencyRule()); //구매 빈도
    policy.add(new ReturnRateRule()); //반품률
  }

  boolean complyWithAll(final PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
