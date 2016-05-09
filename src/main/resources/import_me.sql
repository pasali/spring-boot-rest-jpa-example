CREATE TABLE user
(
    user_id INT(11) PRIMARY KEY NOT NULL,
    email VARCHAR(255) NOT NULL,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    password VARCHAR(255) NOT NULL
);
CREATE UNIQUE INDEX UK_ob8kqyqqgmefl0aco34akdtpe ON user (email);

INSERT INTO test.user (user_id, email, first_name, last_name, password) VALUES (1, 'jon@snow.com', 'jon', 'snow', '123456');
INSERT INTO test.user (user_id, email, first_name, last_name, password) VALUES (2, 'arya@stark.com', 'arya', 'stark', 'afasdf');
INSERT INTO test.user (user_id, email, first_name, last_name, password) VALUES (3, 'oberyn@redviper.com', 'oberyn', 'martel', 'sdfgasdf');
INSERT INTO test.user (user_id, email, first_name, last_name, password) VALUES (4, 'tyrion@titsandwine.com', 'tyrion', 'lanister', '231424');
INSERT INTO test.user (user_id, email, first_name, last_name, password) VALUES (5, 'stark@tony.com', 'tony', 'stark', '23432423141234');