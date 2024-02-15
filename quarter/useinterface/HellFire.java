package quarter.useinterface;
import invariant.Member;
class HellFire implements Magic {
  private final Member member;

  HellFire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "헬파이어";
  }

  public int costMagicPoint() {
    return 16;
  }

  public int attackPower() {
    return 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
  }

  public int costTechnicalPoint() {
    return 20 + (int)(member.level * 0.4);
  }
}
