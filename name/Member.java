package name;

/**
 * 영어로 읽어도 위화감 없는 클래스로 메서드 옮기기
 * 예시: 맴버 상태 체크
 */
public class Member {
  private final States states;

  boolean isInConfusion() {
    return states.contatins(StateType.confused);
  }
}
