package quarter.useinterface;
import invariant.Member;
import quarter.useinterface.MagicType;

/**
 * 하나의 동작에 대해서 한 클래스에 구현하기
 * 예시: 매직 타입에 따른 소비량, 공격력, 테크니컬 포인트
 * 단점: 변경하고 싶은 부분이 많아지면 로직이 점차 길어짐 -> 인터페이스 활용
 */
class MagicBySwitch {
  final String name;
  final int costMagicPoint; //소비량
  final int attackPower; //공격력
  final int costTechnicalPoint; //테크니컬 포인트

  MagicBySwitch(final MagicType magicType, final Member member) {
    switch (magicType) {
      case FIRE:
        name = "파이어";
        costMagicPoint = 2;
        attackPower = 20 + (int)(member.level * 0.5);
        costTechnicalPoint = 0;
        break;

      case LIGHTNING:
        name = "라이트닝";
        costMagicPoint = 5 + (int)(member.level * 0.2);
        attackPower = 50 + (int)(member.agility * 1.5);
        costTechnicalPoint = 5;
        break;

      case HELLFIRE:
        name = "헬파이어";
        costMagicPoint = 16;
        attackPower = 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
        costTechnicalPoint = 20 + (int)(member.level * 0.4);
        break;

      default:
        throw new IllegalAccessException();
    }
  }
}
