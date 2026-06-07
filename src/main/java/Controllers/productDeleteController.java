package Controllers;

import Services.productService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String deleteProduct(@PathVariable Integer id) {
        boolean isDeleted = productService.deleteProductById(id);

        if (isDeleted) {
            return "Product with ID " + id + " was deleted successfully.";
        } else {
            return "Product with ID " + id + " not found.";
        }
    }
}