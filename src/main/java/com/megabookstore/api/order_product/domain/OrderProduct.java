package com.megabookstore.api.order_product.domain;

import com.megabookstore.api.order.domain.Order;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderProductNo;

    @OneToOne
    @JoinColumn(unique = true)
    private Order orderNo;

    @Column(nullable = false, unique = true)
    private Long productNo;

    @Column(nullable = false, columnDefinition = "integer default 1")
    private int count;

    @Column(nullable = false) // TODO #3: isHidden 보단 Hidden ??
    private boolean isHidden;
}