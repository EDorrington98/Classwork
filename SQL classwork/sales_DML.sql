INSERT INTO sales(Country, Quantity, Price_per_unit) VALUES('China',19,7.99);
SELECT * FROM sales;

SELECT AVG(Quantity), AVG(Price_per_unit) FROM sales;

SELECT AVG(Quantity), AVG(Price_per_unit) FROM sales
WHERE Country='UK';

SELECT country, AVG(Quantity), AVG(Price_per_unit) FROM sales
GROUP BY Country;

UPDATE sales
SET Total_Profit = (Quantity * Price_per_unit)
WHERE id = 8;

SELECT Country, AVG(Quantity), (Price_per_unit) FROM sales
GROUP BY Country;

SELECT * FROM sales;