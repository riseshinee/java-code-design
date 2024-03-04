package refactoring;

/**
 * JUnit 예제 테스트코드
 */
public class DeliveryChargeTest {
  //2만원 미만일 때 배송비는 5000원
  @Test
  void payCharge() {
    ShoppingCart emptyCart = new ShoppingCart();
    ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
    ShoppingCart twoProductAdded = oneProductAdded.add((new Product(2, "상품B", 14990)));
    DeliveryCharge charge = new DeliveryCharge(twoProductAdded);
    assertEquals(5000, charge.amount);
  }
  //20000원 이상일 때 배송비는 무료
  @Test
  void chargeFee() {
    ShoppingCart emptyCart = new ShoppingCart();
    ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
    ShoppingCart twoProductAdded = oneProductAdded.add((new Product(2, "상품B", 15000)));
    DeliveryCharge charge = new DeliveryCharge(twoProductAdded);
    assertEquals(5000, charge.amount);
  }

}
