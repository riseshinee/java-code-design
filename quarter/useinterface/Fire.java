package quarter.useinterface;
import invariant.Member;
/**
 * 인터페이스를 상속한 클래스를 구현하여 분기처리하기
 * 예시: 파이어
 */
class Fire implements Magic {
  private final Member member;

  Fire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "파이어";
  }

  public int costMagicPoint() {
    return 2;
  }
  /*
  리턴값을 객체화
  public MagicPoint costMagicPoint() {
    return new MagicPoint(2);
  }
  */
  public int attackPower() {
    return 20 + (int)(member.level * 0.5);
  }

  public int costTechnicalPoint() {
    return 0;
  }
}
