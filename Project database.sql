-- DROP DATABASE project_db;

CREATE DATABASE project_db;
USE project_db;

CREATE TABLE customers(
id int NOT NULL AUTO_INCREMENT,
name varchar(30) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE items(
id int NOT NULL AUTO_INCREMENT,
name varchar(30) NOT NULL,
value int NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE orders(
id int NOT NULL AUTO_INCREMENT,
customers_id int,
cost int NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(customers_id) REFERENCES customers(id)
);

CREATE TABLE items_orders(
id int NOT NULL AUTO_INCREMENT,
orders_id int,
items_id int,
PRIMARY KEY (id),
FOREIGN KEY (orders_id) REFERENCES orders(id),
FOREIGN KEY (items_id) REFERENCES items(id)
);

ALTER TABLE orders ADD COLUMN total_cost int NOT NULL DEFAULT 0;
