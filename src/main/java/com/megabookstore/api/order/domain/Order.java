package com.megabookstore.api.order.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo;

    @Column(nullable = false)
    private Long memberNo;

    @Column(nullable = false)
    private Long recipientDestinationNo;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime orderCreatedAt;

    @Column(nullable = false) // TODO #1: 컬럼 이름 바꾸는 게 어떨지? Subscription이 더 나을듯?
    private boolean isSubscribed;

    @CreatedDate
    @Column(nullable = false)
    private LocalDate selectedDeliveryDate;

}
