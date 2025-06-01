package com.example.product_catalog_backend.controller;

import com.example.product_catalog_backend.entity.Product;
import com.example.product_catalog_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        if(product == null){
            return null;
        }
        return this.productService.createProduct(product);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductByid(@PathVariable Long id){
        Optional<Product> searchResult = this.productService.getProductById(id);
        if(searchResult.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(searchResult.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails){
        Optional<Product> searchResult = this.productService.getProductById(id);
        if(searchResult.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Product updatedProduct = productService.updateProduct(id, productDetails);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        this.productService.deleteProduct(id);
    }
}