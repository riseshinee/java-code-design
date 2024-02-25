package name;

/**
 * 클래스명으로 쉽게 파악하기
 * 예시: 캐릭터의 히트포인트
 */
public class OriginalMaxHitPoint {
  //하드코딩을 하지 말고 상수로 구체적인 의미를 드러내기
  private final int MIN = 10;
  private final int MAX = 999;

  OriginalMaxHitPoint(final int value) {
    if (value < MIN || MAX < value) {
      throw new IllegalArgumentException();
    }
    this.value = value;
  }
}

/*
maxHitPoint라고 하면 캐릭터 히트포인트인지, 장비에 의한 히트포인트인지 알 수 없으므로
각각을 클래스로 만들어서 의미를 쉽게 알 수 있게 만들어야 함
int maxHitPoint = member.maxHitPoint + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
*/
