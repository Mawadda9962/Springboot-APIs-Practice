package com.example.D_Java.Services;

import com.example.D_Java.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    public ProductService() {
        loadSampleProducts();
    }

    private void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public String deleteProductById(int productId) {
        if (productMap.containsKey(productId)) {
            Product product = productMap.get(productId);
            productMap.remove(productId);
            return "Product Deleted Successfully!\n" +
                    "Product ID: " + product.getId() + "\n" +
                    "Product Name: " + product.getName();
        }
        return "Product not found";
    }
}
