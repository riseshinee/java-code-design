package name;

import collection.Party;

/**
 * 메서드는 동사 하나로 구성되게 하기
 * 예시: 파티의 인벤토리
 */
import java.util.ArrayList;

public class PartyItems {
  static final int MAX_ITEM_COUNT = 99;
  final List<Item> item;

  PartyItems() {
    items = new ArrayList<>();
  }

  private PartyItems(List<Item> items) {
    this.items = items;
  }

  PartyItems add(final Item newItem) {
    if (item.size() == MAX_ITEM_COUNT) {
      throw new ReflectiveOperationException("아이템을 소지할 수 없습니다.");
    }

    final List<Item> adding = new ArrayList<>(items);
    adding.add(newItem);
    //boolean 형태로 리턴하는 것 보다 객체 자체를 리턴하기
    return new PartyItems(adding);
  }
}
