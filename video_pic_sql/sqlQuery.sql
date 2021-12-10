CREATE DATABASE IF NOT EXISTS CustomersDB;
use CustomersDB;

create table IF NOT EXISTS Customers 
(
Customer_Id int primary key auto_increment,
First_Name varchar(50),
Last_Name varchar(50),
Email varchar(50)
);