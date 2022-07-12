CREATE DATABASE hospital;
USE hospital;

CREATE TABLE dept (

id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(32)

);

INSERT INTO dept VALUES(1,"外科");
INSERT INTO dept VALUES(2,"内科");
INSERT INTO dept VALUES(3,"妇科"); 
INSERT INTO dept VALUES(4,"生殖科");
 

CREATE TABLE patient (

id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(32),
gender INT,
did INT,
FOREIGN KEY (did) REFERENCES dept(id),
advice VARCHAR(32)
);


INSERT INTO patient VALUES(1,"张三",1,1,"手心出汗");
INSERT INTO patient VALUES(2,"李四",1,2,"腰疼");
INSERT INTO patient VALUES(3,"王五",0,2,"肾虚");
INSERT INTO patient VALUES(4,"老王",1,1,"湿气重");


SELECT * FROM dept;

SELECT * FROM patient;







































































































































































