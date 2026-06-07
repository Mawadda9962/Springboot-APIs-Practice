package com.example.D_Java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productDeleteController {
    private productService productService;



    @Autowired
    public productDeleteController(productService productService) {
        this.productService = productService;
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id) {
        // This now works perfectly because deleteProductById returns a boolean!
        boolean isDeleted = productService.deleteProductById(id);

        if (isDeleted) {
            return new ResponseEntity<>("Product with ID " + id + " was deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Product with ID " + id + " not found.", HttpStatus.NOT_FOUND);
        }

    }

}
