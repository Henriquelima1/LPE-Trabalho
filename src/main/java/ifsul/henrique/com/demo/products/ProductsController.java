/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsul.henrique.com.demo.products;

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
    
    
}
