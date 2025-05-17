package com.example.product_catalog_backend.service;

import com.example.product_catalog_backend.entity.Product;
import com.example.product_catalog_backend.repository.ProductRepositoryJPAInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepositoryJPAInterface PRJI;

    @Autowired
    public ProductService(ProductRepositoryJPAInterface productRepositoryJPAInterface){
        this.PRJI = productRepositoryJPAInterface;
    }

    public List<Product> getAllProducts(){
        return this.PRJI.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return this.PRJI.findById(id);
    }

    public Product createProduct(Product product){
        return this.PRJI.save(product);
    }

    public Product updateProduct(Long id, Product productDetails){
        Optional<Product> searchResult = this.PRJI.findById(id);
        if(searchResult.isEmpty()){
            return null;
        }
        Product optionalToProduct = searchResult.get();
        optionalToProduct.setName(productDetails.getName());
        optionalToProduct.setDescription(productDetails.getDescription());
        optionalToProduct.setPrice(productDetails.getPrice());
        return optionalToProduct;
    }

    public void deleteProduct(Long id){
        this.PRJI.deleteById(id);
    }

    public String formatPrice(BigDecimal price){
        if(price == null){
            return "N/A";
        }
        return "$" + price.setScale(2, RoundingMode.HALF_UP);
    }
}
