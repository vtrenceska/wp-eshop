package mk.ukim.finki.wpeshop.service;

import mk.ukim.finki.wpeshop.model.Product;
import mk.ukim.finki.wpeshop.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addProductToShoppingCart(String username, Long productId);

}
