package quarter.useinterface;


import invariant.Member;

class Lightning implements Magic{
  private final Member member;

  Lightning(final Member member) {
    this.member = member;
  }

  public String name() {
    return "라이트닝";
  }

  public int costMagicPoint() {
    return 5 + (int)(member.level * 0.2);
  }

  public int attackPower() {
    return (int)(member.agility * 1.5);
  }

  public int costTechnicalPoint() {
    return 5;
  }
}
