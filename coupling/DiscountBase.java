package coupling;

/**
 * 상속에 의한 결합
 */
abstract class DiscountBase {
  protected int price;

  int getDiscountedPrice() {
    int discountedPrice = price - discountCharge();
    if (discountedPrice < 0) {
      discountedPrice = 0;
    }
    return discountedPrice;
  }

  protected int discountCharge() {
    return 3000;
  }
}

/**
 * 슈퍼 클래스의 메서드를 새로 오버라이드 하는 경우: 캡슐화가 되어 있지 않아 비즈니스 개념이 분산되고 있음
 * class SummerDiscount extends DiscountBase {
 *  @Override
 *  int getDiscountedPrice() {
 *    return (int)(price * (1.00 - 0.05));
 *  }
 * }
 */
