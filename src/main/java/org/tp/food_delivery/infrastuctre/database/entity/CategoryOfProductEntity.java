package org.tp.food_delivery.infrastuctre.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "categoryOfProductId")
@ToString(of = {"categoryOfProductId", "categoryName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category_of_product")
public class CategoryOfProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_of_product_id")
    private Integer categoryOfProductId;
    @Column(name = "category_name")
    private String categoryName;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "categoryOfProduct")
    private MenuEntity menu;


}
