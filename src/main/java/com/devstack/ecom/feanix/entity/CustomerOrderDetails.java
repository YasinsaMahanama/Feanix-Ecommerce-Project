package com.devstack.ecom.feanix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "customer_order_detail")
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderDetails {
    @EmbeddedId
    private CustomerOrderHasProductKey hasProductKey = new CustomerOrderHasProductKey();

    @Column(name = "qty", nullable = false)
    private int qty;

    @Column(name = "unitPrice", nullable = false)
    private double unitPrice;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(nullable = false, name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("customerOrderId")
    @JoinColumn(nullable = false, name = "customer_order_id")
    private CustomerOrder customerOrder;

}
