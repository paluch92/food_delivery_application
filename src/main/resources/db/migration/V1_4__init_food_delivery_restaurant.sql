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
INSERT INTO restaurant (restaurant_name, address_id, menu_id, available_streets, phone, email)
VALUES
    ('Restauracja Pod Lipą', 1, 1, 'ul. Kwiatowa 5', '+48 123 456 789', 'podlipa@example.com'),
    ('Trattoria Italia', 2, 1, 'ul. Włoska 12', '+48 987 654 321', 'italia@example.com'),
    ('Smakosz Grill', 3, 1, 'ul. Grillowa 7', '+48 555 123 789', 'smakoszgrill@example.com'),
    ('Azjatycka Oaza', 4, 1, 'ul. Wschodnia 21', '+48 777 888 999', 'oaza@example.com'),
    ('Kawiarnia Artystyczna', 5, 1, 'ul. Sztuki 8', '+48 111 222 333', 'artystyczna@example.com');
