CREATE TABLE order_status
(
    order_status_id     SERIAL      NOT NULL,
    restaurant_id       INT         NOT NULL,
    customer_id         INT         NOT NULL,
    product_name        VARCHAR(32) NOT NULL,
    quantity_of_product SMALLINT    NOT NULL,
    date_of_order       TIMESTAMP   NOT NULL,
    order_status        VARCHAR(32) NOT NULL,
    PRIMARY KEY (order_status_id),
    CONSTRAINT fk_order_status_restaurant
            FOREIGN KEY (restaurant_id)
                REFERENCES restaurant (restaurant_id),
    CONSTRAINT fk_order_status_customer
                FOREIGN KEY (customer_id)
                    REFERENCES customer (customer_id)
);
INSERT INTO order_status (restaurant_id, customer_id, product_name, quantity_of_product, date_of_order, order_status)
VALUES
    (1, 1, 'Pizza Margherita', 2, '2022-01-01 12:30:00', 'Złożone'),
    (2, 2, 'Pierogi ruskie', 1, '2022-01-02 18:45:00', 'W trakcie realizacji'),
    (3, 3, 'Schabowy z ziemniakami', 3, '2022-01-03 20:15:00', 'Dostarczone'),
    (4, 4, 'Kurczak curry z ryżem', 2, '2022-01-04 14:00:00', 'Zakończone'),
    (5, 5, 'Placek po węgiersku', 1, '2022-01-05 19:30:00', 'Anulowane');
