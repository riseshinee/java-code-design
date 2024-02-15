package cohesion;
import java.util.List;

/**
 * 의미 있는 단위는 모두 클래스로 만들기: 매개 변수가 많아지는 문제 회피
 * 예시: 장비 착용에 따른 매직포인트 (매직 포인트와 관련된 값들을 인스턴스 변수로 갖도록 구성하기)
 */
public class MagicPoint {
  private int currentAmount; //현재 잔량
  private int originalAmount; //최댓값
  private final List<Integer> maxIncrements; //장비 착용에 따른 최댓값 증가량

  /**
   * 현재 매직포인트 잔량
   * @return
   */
  int current() {
    return currentAmount;
  }

  /**
   * 매직포인트 최댓값
   * @return
   */
  int max() {
    int amount = originalMaxAmount;
    for(int each : maxIncrements) {
      amount += each;
    }
    return amount;
  }

  /**
   * 매직포인트 회복
   * @param recoveryAmount 회복량
   */
  void recover(final int recoveryAmount) {
    currentAmount = Math.min(currentAmount + recoveryAmount, max());
  }

  /**
   * 매직포인트 소비하기
   * @param currentAmount
   */
  void consume(final int currentAmount) {
    //생략
  }

}
