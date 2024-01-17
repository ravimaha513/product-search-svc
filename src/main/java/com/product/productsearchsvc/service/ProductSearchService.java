package com.product.productsearchsvc.service;

import com.product.productsearchsvc.model.Product;
import com.product.productsearchsvc.repository.ProductSearchRepository;
import com.product.productsearchsvc.request.ProductSearchRequest;
import com.product.productsearchsvc.specifications.ProductSpecifications;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductSearchService {

    private final ProductSearchRepository searchRepository;

    public List<Product> findProductBySeachRequest(ProductSearchRequest searchRequest){
        return searchRepository.findAll(ProductSpecifications.withDynamicQuery(searchRequest));
    }
}
