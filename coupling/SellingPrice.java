package coupling;

/**
 * 각각의 개념을 클래스로 분리해서 높은 응집도가 되게 설계하기
 * 예시: 판매 가격 클래스 -> 판매 가격과 상관이 있지만 각각의 개념이 다르므로 클래스로 분리하기
 */
public class SellingPrice {
  final int amount;

  SellingPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalAccessException("가격은 0 이상이어야 합니다.");
    }
    this.amount = amount;
  }
}

/*
//판매 수수료 클래스
class SellingCommision {
  SellingCommision(final SellingPrice sellingPrice) {
    amount = ...
  }
}

//배송비 클래스
class DeliveryCharge {
  DeliveryCharge(final SellingPrice sellingPrice) {
    amount =
  }
}

//쇼핑 포인트 클래스
class ShoppingPoint {
  SellingPoint(final SellingPrice sellingPrice) {
    value = ...
  }
}
*/