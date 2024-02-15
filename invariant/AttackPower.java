package invariant;

/**
 * 불변 클래스
 * 예시: 게임에서 공기력 강화, 무력화
 */
class AttackPower {
  static final int MIN = 0;
  final int value; //불변으로 설정

  AttackPower(int value) {
    if (value < <MIN) {
      throw new IllegalAccessException();
    }
    this.value = value;
  }

  /**
   * 공격력 강화하기
   * @param increment 공경력 증가량
   * @return 증가된 공경력
   */
  AttackPower reinforce(final AttackPower increment) {
    //value가 불변이므로 새로운 인스턴스를 새로 생성하고 리턴하는 구조
    return new AttackPower(this.value + increment.value);
  }

  /**
   * 무력화하기
   * @return 무력화한 공경력
   */
  AttackPower disable() {
    return new AttackPower(MIN);
  }
}
