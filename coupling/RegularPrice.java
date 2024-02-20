package coupling;

/**
 * 결합도가 낮게 설계하기 -> 단일책임원칙
 * 예시: 가격이 정가인지 아닌지 확인하는 기능을 담당하는 클래스
 */
public class RegularPrice {
  private static final int MIN_AMOUNT = 0;
  final int amount;

  RegularPrice(final int amount) {
    if(amount < MIN_AMOUNT) {
      throw new IllegalAccessException("가격은 0 이상이어어야 합니다.")
    }

    this.amount = amount;
  }
}
