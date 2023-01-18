package com.megabookstore.api.order_subscription.domain;

import com.megabookstore.api.order.domain.Orders;
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
public class OrderSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderSubscriptionNo;

    @OneToOne
    @JoinColumn
    private Orders ordersNo;
}
