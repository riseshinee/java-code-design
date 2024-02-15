package quarter.strategypattern;
import java.util.HashMap;
import java.util.Map;

/**
 * 플래그 매개변수에 의해 조건 사용하지 않고 전략 패턴을 사용하기
 * 예시: 대미지 타입에 따른 포인트 전환
 */
public class Test {
  private final Map<DamageType, Damage> damages = new HashMap<>();
  final HitPointDamage hitPointDamage;
  final MagicPointDamage magicPointDamage;

  Test() {
    this.hitPointDamage = new HitPointDamage();
    this.magicPointDamage = new MagicPointDamage();
    damages.put(DamageType.hitPoint, hitPointDamage);
    damages.put(DamageType.magicPoint, magicPointDamage);

  }

  /**
   * 대미지 타입에 따른 포인트 전환
   * @param damageType 대미지 타입
   * @param damageAmount 전환할 포인트 양
   */
  void applyDamage(final DamageType damageType, final int damageAmount) {
    final Damage damage = damages.get(damageType);
    damage.excute(damageAmount);
  }
}
/*
applyDamage(DamageType.magicPoint, damageAmount);
*/