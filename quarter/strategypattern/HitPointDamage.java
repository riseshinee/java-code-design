package quarter.strategypattern;

public class HitPointDamage implements Damage {
  public void execute(final int damageAmount){
    member.hitPoint -= demageAmount;
    if (0 < member.hitPoint) return;

    member.hitPoint = 0;
    member.addState(StateType.dead);
  }
}
