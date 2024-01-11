package org.tp.food_delivery.infrastuctre.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "productName", "price", "categoryOfProduct"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer menuId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "price")
    private BigDecimal price;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_of_product_id")
    private CategoryOfProductEntity categoryOfProduct;


    @OneToOne(fetch = FetchType.LAZY, mappedBy = "menu")
    private RestaurantEntity restaurant;


}
