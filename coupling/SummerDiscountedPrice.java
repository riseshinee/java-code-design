package coupling;

/**
 * 결합도가 낮게 설계하기 -> 단일 책임 원칙
 * 예시: 여름 할인 클래스
 */
public class SummerDiscountedPrice {
  private static final int MIN_AMOUNT = 0;
  private static final int DISCOUNT_AMOUNT = 3000;
  final int amount;

  SummerDiscountedPrice(final RegularPrice price) {
    int discountedAmount = price.amount - DISCOUNT_AMOUNT;
    if (discountedAmount < MIN_AMOUNT) {
      discountedAmount = MIN_AMOUNT;
    }
    amount = discountedAmount;
  }

}
