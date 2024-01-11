CREATE TABLE address
(
    address_id  SERIAL      NOT NULL,
    country     VARCHAR(32) NOT NULL,
    city        VARCHAR(32) NOT NULL,
    postal_code VARCHAR(32) NOT NULL,
    street      VARCHAR(32) NOT NULL,
    PRIMARY KEY (address_id)
);

INSERT INTO address (country, city, postal_code, street)
VALUES
    ('Polska', 'Warszawa', '00-001', 'ul. Wiejska 12'),
    ('Polska', 'Kraków', '30-001', 'ul. Floriańska 23'),
    ('Polska', 'Gdańsk', '80-001', 'ul. Długa 45'),
    ('Polska', 'Wrocław', '50-001', 'ul. Rynek 8'),
    ('Polska', 'Poznań', '60-001', 'ul. Święty Marcin 55'),
    ('Polska', 'Warszawa', '00-001', 'ul. Marszałkowska 1'),
    ('Polska', 'Kraków', '30-001', 'ul. Floriańska 10'),
    ('Polska', 'Gdańsk', '80-001', 'ul. Długa 15'),
    ('Polska', 'Wrocław', '50-001', 'ul. Rynek 5'),
    ('Polska', 'Poznań', '60-001', 'ul. Święty Marcin 10');