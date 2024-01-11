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

INSERT INTO customer (name, surname, phone, email, address_id)
VALUES
    ('Anna', 'Kowalska', '+48 111 222 333', 'anna.kowalska@example.com', 6),
    ('Jan', 'Nowak', '+48 444 555 666', 'jan.nowak@example.com', 7),
    ('Katarzyna', 'Wiśniewska', '+48 777 888 999', 'katarzyna.wisniewska@example.com', 8),
    ('Piotr', 'Lis', '+48 123 456 789', 'piotr.lis@example.com', 9),
    ('Magdalena', 'Jankowska', '+48 555 123 789', 'magda.jankowska@example.com', 10);
