CREATE DATABASE data;
USE data;

CREATE TABLE customer (
   id INT NOT NULL,
   firstName VARCHAR(45) NOT NULL,
   lastName VARCHAR(45) NOT NULL,
   phoneNumber VARCHAR(45) NOT NULL,
   email VARCHAR(45) NOT NULL,
   career VARCHAR(45) NOT NULL,
   incomePerMonth float not null,
   PRIMARY KEY (id)
);
