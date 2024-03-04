package refactoring;

/**
 * 조건을 읽기 쉽게 하기
 * 예시: 포인트로 구매가 가능한지 체크하는 클래스
 */
public class PurchasePointPayment {
  PurchasePointPayment(final Customer customer, final Comic comin) {
    //!customer.isEnabled() 보다는 customer.isDisabled() 읽기 쉬움
    if (customer.isDisabled()) {
      throw new IllegalArgumentException("유효하지 않은 계정입니다.");
    }
    if (comic.isDisabled()) {
      throw new IllegalArgumentException("현재 구매할 수 없는 만화입니다.");
    }
    if(customer.isShortOfPoint(comic)) {
      throw new RuntimeException("보유하고 있는 포인트가 부족합니다.");
    }
    customerId = customer.id;
    comicId = comic.id;
  }
}
