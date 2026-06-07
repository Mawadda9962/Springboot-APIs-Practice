package Controllers;

import Entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {

    HashMap<Integer, Product> productHashMap = new HashMap<>();

    public ProductController(){
        productHashMap.put(1, new Product(1, "SmartWatch", 10));
    }

    @PutMapping("/updateStock/{id}")
    public String updateProductStock(@PathVariable Integer id, @RequestParam int Quantity){

      if (!productHashMap.containsKey(id)){
          return "Product not found";
    }

      Product product = productHashMap.get(id);


      int previousStock = product.getStockQuantity();

      product.setStockQuantity(Quantity);

        return "Product Updated Successfully " +
                "Product Name: " + product.getName() + " " +
                "Previous Stock: " + previousStock + " " +
                "Updated Stock: " + product.getStockQuantity();
    }

}
