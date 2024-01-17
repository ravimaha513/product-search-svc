package com.product.productsearchsvc.controller;


import com.product.productsearchsvc.model.Product;
import com.product.productsearchsvc.request.ProductSearchRequest;
import com.product.productsearchsvc.service.ProductSearchService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class ProductSearchController {
    private final ProductSearchService service;
    @PostMapping("/api/products")
    public List<Product> getProducts(@RequestBody ProductSearchRequest searchRequest){
        log.info("Search Request {}", searchRequest);
        return service.findProductBySeachRequest(searchRequest);
    }
}
