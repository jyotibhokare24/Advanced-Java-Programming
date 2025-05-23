-- Create the database
CREATE DATABASE test;

-- Use the database
USE test;

-- Create the coffee table
CREATE TABLE coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(50),
    price DECIMAL(5,2)
);
