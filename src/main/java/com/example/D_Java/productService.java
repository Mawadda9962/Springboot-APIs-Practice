package com.example.D_Java;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class productService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    public productService() {
        loadSampleProducts();
    }

    private void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public boolean deleteProductById(int productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
            return true;
        }
        return false;
    }
}
