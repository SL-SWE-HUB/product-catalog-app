package com.example.product_catalog_backend.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    void setUp(){
        this.productService = new ProductService(null);
    }

    @Test
    @DisplayName("Expect price to be formatted correctly with two decimal places")
    void testFormatPrice_PositiveValue(){
        //Step 1: Arrange input data setup
        BigDecimal price  = new BigDecimal("99.99");
        String expectedFormattedPrice = "$99.99";

        //Step 2: Act by calling the method under test
        String actualFormattedPrice = this.productService.formatPrice(price);

        //Step 3: Assert by verifying the result is as expected
        assertEquals(expectedFormattedPrice, actualFormattedPrice, "Formatting positive price failed");
    }

    @Test
    @DisplayName("Expect price to be formatted with rounding")
    void testFormatPrice_NeedsRounding(){
        //Step 1: Arrange
        BigDecimal price = new BigDecimal("123.456");
        String expectedFormattedPrice = "$123.46";

        //Step 2: Act
        String actualFormattedPrice = productService.formatPrice(price);

        //Step 3: Assert
        assertEquals(expectedFormattedPrice,actualFormattedPrice, "Formatting with rounding failed");
    }

    @Test
    @DisplayName("Expect N/A returned from null price")
    void testFormatPrice_NullValue(){
        //Step 1: Arrange
        BigDecimal price = null;
        String expectedFormattedValue = "N/A";

        //Step 2: Act
        String actualFormattedValue = productService.formatPrice(price);

        //Step 3: Assert
        assertEquals(expectedFormattedValue,actualFormattedValue, "Handling null price failed");
    }
}
