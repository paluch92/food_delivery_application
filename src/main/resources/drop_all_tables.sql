DROP TABLE IF EXISTS address CASCADE;
DROP TABLE IF EXISTS restaurant CASCADE;
DROP TABLE IF EXISTS customer CASCADE;
DROP TABLE IF EXISTS menu CASCADE;
DROP TABLE IF EXISTS order_status CASCADE;
DROP TABLE IF EXISTS category_of_product CASCADE;
DROP TABLE IF EXISTS all_restaurants CASCADE;
DROP TABLE IF EXISTS available_restaurants CASCADE;


CREATE TABLE address
(
    address_id  SERIAL      NOT NULL,
    country     VARCHAR(32) NOT NULL,
    city        VARCHAR(32) NOT NULL,
    postal_code VARCHAR(32) NOT NULL,
    street     VARCHAR(32) NOT NULL,
    PRIMARY KEY (address_id)
);
CREATE TABLE category_of_product
(
    category_of_product_id  SERIAL      NOT NULL,
    category_name           VARCHAR(32) NOT NULL,
    PRIMARY KEY (category_of_product_id)
);
INSERT INTO category_of_product
(category_name)
VALUES
('appetizers'),
('soups'),
('main course'),
('desserts');

CREATE TABLE menu
(
    menu_id                 SERIAL          NOT NULL,
    product_name            VARCHAR(32)     NOT NULL,
    category_of_product_id  INT             NOT NULL,
    price                   NUMERIC(19, 2)  NOT NULL,
    PRIMARY KEY (menu_id),
    CONSTRAINT fk_menu_category_of_product
            FOREIGN KEY (category_of_product_id)
                REFERENCES category_of_product (category_of_product_id)
);

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
CREATE TABLE customer
(
    customer_id SERIAL      NOT NULL,
    name        VARCHAR(32) NOT NULL,
    surname     VARCHAR(32) NOT NULL,
    phone       VARCHAR(32) NOT NULL,
    email       VARCHAR(32) NOT NULL,
    address_id  INT         NOT NULL,
    PRIMARY KEY (customer_id),
    UNIQUE (email),
    CONSTRAINT fk_customer_address
        FOREIGN KEY (address_id)
            REFERENCES address (address_id)
);
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

CREATE TABLE all_restaurants
(
    all_restaurants_id      SERIAL      NOT NULL,
    restaurant_id           INT         NOT NULL,
    PRIMARY KEY (all_restaurants_id),
    CONSTRAINT fk_all_restaurants_restaurant
                FOREIGN KEY (restaurant_id)
                    REFERENCES restaurant (restaurant_id)
);
CREATE TABLE available_restaurants
(
    available_restaurants_id    SERIAL      NOT NULL,
    restaurant_id               INT         NOT NULL,
    PRIMARY KEY (available_restaurants_id),
    CONSTRAINT fk_available_restaurants_restaurant
                FOREIGN KEY (restaurant_id)
                    REFERENCES restaurant (restaurant_id)
);


