package com.example.D_Java;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {

    HashMap<Integer,Product> productHashMap = new HashMap<>();

    public ProductController(){
        productHashMap.put(1, new Product(1, "SmartWatch", 10));
    }

    @PutMapping("/updateStock/{id}")
    public String updateProductStock(@PathVariable Integer id, @RequestParam int Quantity){

      if (!productHashMap.containsKey(id)){
          return "Product not found";
    }

      Product product = productHashMap.get(id);



}
