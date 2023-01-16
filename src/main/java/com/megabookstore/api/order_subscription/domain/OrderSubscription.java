package com.megabookstore.api.order_subscription.domain;

import com.megabookstore.api.order.domain.Order;
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

    @OneToOne // TODO #2 :구독과 주문과의 관계를 어떻게 봐야할까?
    @JoinColumn
    private Order orderNo;
}
