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
INSERT INTO menu (product_name, category_of_product_id, price)
VALUES
    ('Pizza Margherita', 3, 24.99),
    ('Pierogi ruskie', 3, 12.50),
    ('Schabowy z ziemniakami', 3, 18.75),
    ('Kurczak curry z ryżem', 3, 22.50),
    ('Placek po węgiersku', 3, 15.99),
    ('Zupa pomidorowa', 2, 8.99),
    ('Carppacio', 1, 14.25),
    ('Frytki', 1, 9.99),
    ('Sernik', 4, 4.50),
    ('Karpatka', 4, 3.75);