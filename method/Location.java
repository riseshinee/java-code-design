package method;

/**
 * 오류는 리턴 값으로 리턴하지 말고 예외 발생시키기
 * 예시: 특정 값을 갖는 Location 자료형
 */
public class Location {
  Location(final int x, final int y) {
    if(!valid(x,y)){
      throw new IllegalArgumentException("잘못된 위치입니다.");
    }

    this.x = x;
    this.y = y;
  }

  Location shift(final int shiftX, final int shiftY) {
    int nextX = x + shiftX;
    int nexty = y + shiftY;

    return new Location(shiftX, shiftY);
  }
}
