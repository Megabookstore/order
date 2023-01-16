package com.megabookstore.api.order_subscription_history.domain;

import com.megabookstore.api.order_subscription.domain.OrderSubscription;
import com.megabookstore.api.subscription_order_status.domain.SubscriptionOrderStatus;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderSubscriptionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionProductOrderStatusNo;

    @ManyToOne
    @JoinColumn
    private SubscriptionOrderStatus orderStatusNo;

    @ManyToOne
    @JoinColumn
    private OrderSubscription orderSubscriptionNo;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime orderStatusCreatedAt;
}
