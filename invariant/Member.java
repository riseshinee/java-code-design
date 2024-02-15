package invariant;

public class Member {
  final HitPoint hitPoint;
  //final States states;

  Member(HitPoint hitPoint) {
    this.hitPoint = hitPoint;
  }

  /**
   * 대미지 받는 처리
   * @param demageAmount
   */
  void damage(final int demageAmount) {
    hitPoint.demage(demageAmount);
    if (hitPoint.isZero()) {
      //states.add(StateType.dead);
    }
  }
}
