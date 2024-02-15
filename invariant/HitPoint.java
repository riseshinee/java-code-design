package invariant;

/**
 * 가변 클래스 예제: 히트포인트
 */
public class HitPoint {
  private static final int MIN = 0;
  int amount;

  HitPoint(final int amount) {
    if (amount < MIN) {
      //음수 일 때 error return
      throw new IllegalAccessException();
    }
    this.amount = amount;
  }

  /**
   * 대미지 받기
   * @param demageAmount 대미지 크기
   */
  void demage(final int demageAmount) {
    final int nextAmount = amount - demageAmount;
    amount = Math.max(MIN, nextAmount);
  }

  /**
   * 히트 포인트가 0이면 true
   * @return
   */
  boolean isZero() {
    return amount == MIN;
  }
}
