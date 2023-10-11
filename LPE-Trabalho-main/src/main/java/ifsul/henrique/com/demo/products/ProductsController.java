/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsul.henrique.com.demo.products;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 20182PF.CC0041
 */
@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductsRepository productsRepository;
    
    @Autowired
    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
    
    @GetMapping
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Products> getEntityAById(@PathVariable Long id) {
        Optional<Products> products = productsRepository.findById(id);
        return products.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    
    @PostMapping
    public ResponseEntity<Products> createEntityA(@RequestBody Products products) {
        Products savedEntityProducts = productsRepository.save(products);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEntityProducts);
    }
}
