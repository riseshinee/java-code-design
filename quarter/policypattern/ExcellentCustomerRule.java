package quarter.policypattern;

/**
 * 우수 고객 규칙 인터페이스
 */
public interface ExcellentCustomerRule {
  boolean ok(final PurchaseHistory history);
}
