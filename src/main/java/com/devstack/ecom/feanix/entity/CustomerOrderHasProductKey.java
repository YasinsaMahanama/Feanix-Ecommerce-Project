package com.devstack.ecom.feanix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class CustomerOrderHasProductKey implements Serializable {
    @Column(name = "product_id")
    private String productId;

    @Column(name = "customer_order_id")
    private String customerOrderId;


}
