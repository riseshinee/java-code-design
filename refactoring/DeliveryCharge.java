package refactoring;

/**
 * 테스트코드로 테스트를 진행하면서 리팩터링 하기
 * 예시: 배송비
 */

public class DeliveryCharge {
  private static final int CHARGE_FREE_THRESHOLD = 20000;
  private static final int PAY_CHARGE = 5000;
  private static final int CHARGE_FREE = 0;
  final int amount;

  DeliveryCharge(final ShoppingCart shoppingCart) {
    amount = (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD ) ? PAY_CHARGE : CHARGE_FREE;
  }
}
