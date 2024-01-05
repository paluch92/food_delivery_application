CREATE TABLE order_status
(
    order_status_id     SERIAL      NOT NULL,
    restaurant_id       INT         NOT NULL,
    customer_id         INT         NOT NULL,
    product_name        VARCHAR(32) NOT NULL,
    quantity_of_product SMALLINT    NOT NULL,
    date_of_order       TIMESTAMP   NOT NULL,
    active              BOOLEAN     NOT NULL,
    PRIMARY KEY (order_status_id),
    CONSTRAINT fk_order_status_restaurant
            FOREIGN KEY (restaurant_id)
                REFERENCES restaurant (restaurant_id),
    CONSTRAINT fk_order_status_customer
                FOREIGN KEY (customer_id)
                    REFERENCES customer (customer_id)
);