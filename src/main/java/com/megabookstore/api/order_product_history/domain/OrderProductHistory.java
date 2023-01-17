package com.megabookstore.api.order_product_history.domain;

import com.megabookstore.api.order_product.domain.OrderProduct;
import com.megabookstore.api.order_status.domain.OrderStatus;
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
public class OrderProductHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderProductOrderStatusNo;

    @ManyToOne
    @JoinColumn
    private OrderStatus orderStatusNo;

    @ManyToOne
    @JoinColumn
    private OrderProduct orderProductNo;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime orderStatusCreatedAt;
}
