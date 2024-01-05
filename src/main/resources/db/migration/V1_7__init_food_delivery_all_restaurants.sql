CREATE TABLE all_restaurants
(
    all_restaurants_id      SERIAL      NOT NULL,
    restaurant_id           INT         NOT NULL,
    PRIMARY KEY (all_restaurants_id),
    CONSTRAINT fk_all_restaurants_restaurant
                FOREIGN KEY (restaurant_id)
                    REFERENCES restaurant (restaurant_id)
);