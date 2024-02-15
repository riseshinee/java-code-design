package quarter.policypattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 정책 패턴: 클래스로 조건을 만들어서 set에 추가 후 사용
 * 우수 고객 정책
 */
public class ExcellentCustomerPolicy {
  private final Set<ExcellentCustomerRule> rules;

  ExcellentCustomerPolicy() {
    rules = new HashSet<>();
  }

  /**
   * 규칙 추가
   * @param rule
   */
  void add(final ExcellentCustomerRule rule) {
    rules.add(rule);
  }

  /**
   * history 구매 이력
   * @param history
   * @return 규칙을 모두 만족하는 경우 true
   */
  boolean complyWithAll(final PurchaseHistory history) {
    for(ExcellentCustomerRule each : rules) {
      if (!each.ok(history)) return false;
    }
    return true;
  }
}