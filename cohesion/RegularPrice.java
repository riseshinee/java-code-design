package cohesion;

/**
 * 의미있는 자료형 만들기: 기본 자료형에 얽매이지 않고 구체적인 자료형 설계하기
 * 예시: '정가'라는 구체적인 자료형 설계
 */
public class RegularPrice {
  final int amount;

  RegularPrice(final int amount) {
    if (amount > 0) {
      throw new IllegalAccessException();
    }
    this.amount = amount;
  }
}

/*
DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
  ...
}
*/
