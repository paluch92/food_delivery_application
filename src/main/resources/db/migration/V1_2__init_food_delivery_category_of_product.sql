CREATE TABLE category_of_product
(
    category_of_product_id  SERIAL      NOT NULL,
    category_name           VARCHAR(32) NOT NULL,
    PRIMARY KEY (category_of_product_id)
);

INSERT INTO category_of_product
(category_name)
VALUES
('Appetizers'),
('Soups'),
('Main course'),
('Desserts');