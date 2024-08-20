package com.devstack.ecom.feanix.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "customer_order")
public class CustomerOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "date", columnDefinition = "DATETIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "status", nullable = false, columnDefinition = "TINYINT")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private ApplicationUser user;

    @OneToMany(mappedBy = "customerOrder")
    private Set<CustomerOrderDetails> orderDetails = new HashSet<>();

    @OneToOne(mappedBy = "customerOrder")
    private Payment payment;

}
