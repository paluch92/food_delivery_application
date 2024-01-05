package org.tp.food_delivery.infrastuctre.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "allRestaurantsId")
@ToString(of = {"allRestaurantsId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "all_restaurants")
public class AllRestaurantsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "all_restaurants_id")
    private Integer allRestaurantsId;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "all_restaurants")
    @JoinColumn(name = "restaurant_id")
    private Set<RestaurantEntity> restaurants;
}