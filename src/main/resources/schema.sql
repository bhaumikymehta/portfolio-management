DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          first_name VARCHAR(250) NOT NULL,
                          last_name VARCHAR(250) NOT NULL,
                          career VARCHAR(250) DEFAULT NULL
);
