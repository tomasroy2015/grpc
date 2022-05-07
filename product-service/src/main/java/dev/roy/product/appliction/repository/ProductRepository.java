package dev.roy.product.appliction.repository;

import dev.roy.product.appliction.ProductInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductRepository {

    private final Map<String, ProductInfo> productStorage;

    public ProductRepository() {
        productStorage = loadProduct();
    }

    public Optional<ProductInfo> get(String productId) {
        return Optional.ofNullable(productStorage.get(productId));
    }

    private Map<String, ProductInfo> loadProduct() {
        Map<String, ProductInfo> products = new HashMap<>();
        products.put(
                "apple-123",
                ProductInfo.builder()
                        .sku("abc")
                        .name("Apple iPhone 12 Pro (128GB)")
                        .description("Apple iPhone 12 Pro (128GB) - Graphite")
                        .price(1617.29)
                        .build());
        products.put(
                "apple-124",
                ProductInfo.builder()
                        .sku("abc")
                        .name("Apple iPhone 12 Pro Max (128GB)")
                        .description("Apple iPhone 12 Pro (128GB) - Graphite")
                        .price(1752.59)
                        .build());
        return products;
    }
}
