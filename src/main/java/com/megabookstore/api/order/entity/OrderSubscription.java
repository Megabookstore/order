package com.megabookstore.api.order.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo ;

    @Column(nullable = false)
    private Long memberNo ;

    @Column(nullable = false)
    private Long recipientDestinationNo ;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp orderCreatedAt ;

    @Column(nullable = false)
    private boolean isSubscribed ;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp selectedDeliveryDate ;

}
