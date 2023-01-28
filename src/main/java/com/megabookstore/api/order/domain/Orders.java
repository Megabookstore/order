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
public class Orders {

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

    @Column(nullable = false)
    private boolean subscriptionYn;

    @CreatedDate
    @Column(nullable = false)
    private LocalDate selectedDeliveryDate;

    @Embedded
    private PayYn payYn;
}
