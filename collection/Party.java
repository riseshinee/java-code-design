package collection;
import java.util.ArrayList;
import java.util.List;

import invariant.Member;
/**
 * 리스트 조작에 필요한 로직을 모두 하나의 클래스에 정의하기
 * 예시: 파티 멤버 관리 클래스
 */
public class Party {
  static final int MAX_MEMBER_COUNT = 4;
  private final List<Member> members;

  Party() {
    members = new ArrayList<Member>();
  }

  private Party(List<Member> members) {
    this.members = members;
  }

  /**
   * 멤버 리스트를 불변으로 처리
   * @return
   */
  List<Member> members() {
    return members.unmodifiableList();
  }

  /**
   * 멤버 추가하기
   * @param newMember 추가하고 싶은 멤버
   * @return
   */
  Party add(final Member newMember) {
    if (exists(newMember)) {
      throw new RuntimeException("이미 파티에 참가되어 있습니다.");
    }
    if(isFull()) {
      throw  new RuntimeException("이 이상 멤버를 추가할 수 없습니다.");
    }

    final List<Member> adding = new ArrayList<>(members);
    adding.add(newMember);
    return new Party(adding);
  }

  /**
   * 파티 멤버가 살아 있는지 체크
   * @return
   */
  boolean isAlive() {
    return members.stream().anyMatch(each -> each.isAlive());
  }

  /**
   * 파티 멤버에 소속되어 있는지 체크
   * @param member
   * @return
   */
  boolean exists(final Member member) {
    return members.stream().anyMatch(each -> each.id == member.id);
  }

  /**
   * 파티 인원이 최대인자 아닌지 체크
   * @return
   */
  boolean isFull() {
    return members.size() == MAX_MEMBER_COUNT;
  }
}
