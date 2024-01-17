package com.product.productsearchsvc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "product_id")
    Long prdId;

    @Column(name = "product_desc")
    String productDesc;

    @Column(name = "product_cost")
    Double productCost;

    @Column(name = "product_name")
    String productName;

    @Column(name = "product_category")
    String productCategory;

   /* @Lob
    @Column(name = "product_img")
    Byte[] productImg;*/

}

