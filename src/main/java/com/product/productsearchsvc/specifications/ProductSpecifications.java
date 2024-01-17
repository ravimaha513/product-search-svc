package com.product.productsearchsvc.specifications;

import com.product.productsearchsvc.model.Product;
import com.product.productsearchsvc.request.ProductSearchRequest;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
public class ProductSpecifications {
    public static Specification<Product> withDynamicQuery(final ProductSearchRequest searchRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (searchRequest.getPrdId() != null) {
                predicates.add(criteriaBuilder.equal(root.get("prdId"), searchRequest.getPrdId()));
            }

            if (searchRequest.getProductName() != null && !searchRequest.getProductName().isEmpty()) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("productName")), "%" + searchRequest.getProductName().toLowerCase() + "%"));
            }

            if (searchRequest.getProductCategory() != null && !searchRequest.getProductCategory().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("productCategory"), searchRequest.getProductCategory()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
