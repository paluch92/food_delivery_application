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