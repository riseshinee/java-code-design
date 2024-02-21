package demon;

/**
 * NULL을 다루지 않는 예제
 * 예시: 방어구, 방어력 표현
 */
public class Equipment {
  static final Equipment EMPTY = new Equipment("장비없음", 0, 0, 0);

  final String name;
  final int price;
  final int defence;
  final int magicDefence;

  Equipment(final String name, final int price, final int defence, final int magicDefence) {
    if(name.isEmpty()) {
      throw new IllegalAccessException("잘못된 이름입니다.");
    }
    this.name = name;
    this.price = price;
    this.defence = defence;
    this.magicDefence = magicDefence;
  }
  /**
   * 모든 장비 해제
   */
  /*
  void takeOffAllEquipments() {
    head = Equipment.EMPTY;
    body = Equipment.EMPTY;
    arm = Equipment.EMPTY;
  }
  */
}
