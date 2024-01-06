CREATE TABLE restaurant
(
    restaurant_id      SERIAL       NOT NULL,
    restaurant_name    VARCHAR(32)  NOT NULL,
    address_id         INT          NOT NULL,
    menu_id            INT,
    available_streets  VARCHAR(128) NOT NULL,
    phone              VARCHAR(32)  NOT NULL,
    email              VARCHAR(32)  NOT NULL,
    PRIMARY KEY (restaurant_id),
    UNIQUE (restaurant_name),
    UNIQUE (email),
    CONSTRAINT fk_restaurant_address
        FOREIGN KEY (address_id)
            REFERENCES address (address_id),
    CONSTRAINT fk_restaurant_menu
        FOREIGN KEY (menu_id)
            REFERENCES menu (menu_id)
);