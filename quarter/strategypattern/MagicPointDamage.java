package quarter.strategypattern;

public class MagicPointDamage implements Damage{
  public void execute(final int damageAmount){
    member.hitPoint -= demageAmount;
    if (0 < member.magicPoint) return;

    member.magicPoint = 0;
  }
}
