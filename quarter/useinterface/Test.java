package quarter.useinterface;

import java.util.HashMap;
import java.util.Map;
import invariant.Member;

/**
 * Magic 인터페이스로 마법 처리 전체 변경하기
 */
class Test {
  final Map<MagicType, Magic> magics = new HashMap<>(); //Map으로 처리 구분
  final Fire fire;
  final Lightning lightning;
  final HellFire hellFire;
  Test(final Member member) {
    this.fire = new Fire(member);
    this.lightning = new Lightning(member);
    this.hellFire = new HellFire(member);
    //키를 magic type으로 지정하고 값을 magic 인터페이스 구현 클래스의 인스턴스로 지정하기
    magics.put(MagicType.FIRE, fire);
    magics.put(MagicType.LIGHTNING, lightning);
    magics.put(MagicType.HELLFIRE, hellFire);
  }

  /**
   * 매직 타입에 따른 마법 공격 실행하기
   * @param magicType
   */
  void MagicAttack(final MagicType magicType) {
    final Magic usingMagic = magics.get(magicType);

    showMagicName(usingMagic);
    consumeMagicPoint(usingMagic);
    consumeTechnicalPoint(usingMagic);
    magicDamage(usingMagic);
  }

  /**
   * 마법 이름을 화면에 출력하기
   * @param magic
   */
  void showMagicName(final Magic magic) {
    final String name = magic.name();
    //출력 처리
  }

  void consumeMagicPoint(final Magic magic) {
    final int costMagicPoint = magic.costMagicPoint();
    //마법 소비 처리
  }

  void consumeTechnicalPoint(final Magic magic) {
    final int costTechnicalPoint = magic.costTechnicalPoint();
    //테크니컬 포인트 소비 처리
  }

  void magicDamage(final Magic magic) {
    final int attackPower = magic.attackPower();
    //대미지 계산
  }


}
