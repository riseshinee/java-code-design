package refactoring;

import java.util.ArrayList;

/**
 * 테스트 코드를 사용한 리팩터
 * 예시: 장바구니 (이상적인 클래스만 기본 형태를 잡아놓기)
 */

public class ShoppingCart {
  final List<Product> products;

  ShoppingCart() {
    products = new ArrayList<Product>();
  }

  private ShoppingCart(List<Product> products) {
    this.products = products;
  }

  ShoppingCart add(final Product product) {
    final List<Product> adding = new ArrayList<>(product);
    adding.add(product);
    return new ShoppingCart(adding);
  }
}
