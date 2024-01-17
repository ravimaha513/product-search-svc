package com.product.productsearchsvc.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder //read abt this
public class ProductSearchRequest {
    Long prdId;
    String productName;
    String productCategory;
}
