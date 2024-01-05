package org.tp.food_delivery.infrastuctre.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "orderStatusId")
@ToString(of = {"orderStatusId", "productName", "quantityOfProduct", "active"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_status")
public class OrderStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_status_id")
    private Integer orderStatusId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "quantity_of_product")
    private BigDecimal quantityOfProduct;
    @Column(name = "date_of_order")
    private OffsetDateTime dateOfOrder;
    @Column(name = "active")
    private Boolean active;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderStatus")
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderStatus")
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

}
