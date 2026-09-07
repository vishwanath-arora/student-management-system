CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO students VALUES
(101,'Rahul','BCA'),
(102,'Priya','B.Tech');
