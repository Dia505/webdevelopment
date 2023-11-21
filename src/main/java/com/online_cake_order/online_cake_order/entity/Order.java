package com.online_cake_order.online_cake_order.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {
    @Id
    @SequenceGenerator(name = "order_seq_gen", sequenceName = "order_orderId_seq", allocationSize = 1)
    @GeneratedValue(generator = "order_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="quantity", nullable = false)
    private Integer quantity;
}
