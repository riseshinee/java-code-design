package refactoring;

import java.util.ArrayList;

/**
 * 테스트코드로 테스트를 진행하면서 리팩터링 하기
 * 예시: 장바구니
 */

public class ShoppingCart {
  final List<Product> products;

  ShoppingCart() {
    products = new ArrayList<Product>();
  }

  private ShoppingCart(List<Product> products) {
    this.products = products;
  }

  /**
   * 장바구니에 상품 추가
   * @param product
   * @return
   */
  ShoppingCart add(final Product product) {
    final List<Product> adding = new ArrayList<>(product);
    adding.add(product);
    return new ShoppingCart(adding);
  }

  /**
   * 상품 합계 금액
   * @return
   */
  int totalPrice() {
    int amount = 0;
    for (Product each : products) {
      amount += each.price;
    }
    return amount;
  }
}
