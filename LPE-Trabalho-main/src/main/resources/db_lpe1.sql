/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  20182PF.CC0041
 * Created: 10 de out. de 2023
 */

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    code VARCHAR(255),
    name VARCHAR(255),
    description TEXT,
    image BYTEA,
    price DOUBLE PRECISION,
    date DATE,
    category VARCHAR(255),
    quantity INTEGER,
    inventory_status VARCHAR(255),
    rating INTEGER
);


CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE user_roles (
    user_id BIGINT REFERENCES users(id),
    role_name VARCHAR(255),
    PRIMARY KEY (user_id, role_name)
);