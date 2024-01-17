package com.product.productsearchsvc.repository;

import com.product.productsearchsvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSearchRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
