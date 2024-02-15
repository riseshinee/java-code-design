package invariant;

class Weapon {
  final AttackPower attackPower;
  Weapon(final AttackPower attackPower) {
    this.attackPower = attackPower;
  }

  /**
   * 무기 강화하기
   * @param incremnet
   * @return
   */
  Weapon reinforce(final AttackPower incremnet) {
    final AttackPower reinforced = attackPower.reinforce(incremnet);
    return new Weapon(reinforced);
  }
}

/*
final AttackPower attackPowerA = new AttackPower(20);
final AttackPower attackPowerB = new AttackPower(20);
final Weapon weaponA = new Weapon(attackPowerA);
final Weapon weaponB = new Weapon(attackPowerB);
//공격력 강화
final AttackPower reinforced =
          attackPower.reinforce(new AttackPower(15));
//다른 스레드에서 처리
final AttackPower disabled = attackPower.disable();
final AttackPower increment = new AttackPower(5);
//무기력 강화
final Weapon reinforceWeaponA = weaponA.reinforce(increment);
*/