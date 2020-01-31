CREATE database cupsales;
use cupsales;

CREATE TABLE sales(
id int AUTO_INCREMENT,
Country varchar(25) NOT NULL,
Quantity int,
Price_per_unit dec(7,2),
PRIMARY KEY(id)
);

ALTER TABLE sales ADD Total_Profit dec(7,2); 