USE hotelmanagementsystem;

DROP TABLE login;

CREATE TABLE login(username varchar(25), password varchar(25));

INSERT INTO login values('admin', '12345');

SELECT * FROM login;

CREATE TABLE employee(
	name varchar(25), 
	age varchar(10), 
	gender varchar(15), 
	job varchar(30), 
	salary varchar(15), 
	phone varchar(15), 
	email varchar(40), 
	aadhar varchar(20)
);

SELECT * FROM employee;

CREATE TABLE room(
	roomnumber varchar(10), 
    availability varchar(20), 
    cleaning_status varchar(20), 
    price varchar(20), 
    bed_type varchar(20)
);

SELECT * FROM room;

DROP TABLE room;

CREATE TABLE driver(
	name varchar(20), 
    age varchar(10), gender 
    varchar(15), 
    company varchar(20), 
    brand varchar(20), 
    available varchar(20), 
    location varchar(40)
);

DROP TABLE driver;

SELECT * FROM driver;

CREATE TABLE customer(
	document varchar(20), 
    number varchar(30), 
    name varchar(30), 
    gender varchar(15), 
    country varchar(20), 
    room varchar(10), 
    checkintime varchar(80), 
    deposit varchar(20)
);

SELECT * FROM customer;

CREATE TABLE department(
	department varchar(30), 
    budget varchar(30)
);

insert into department values('Front Office','500000');
insert into department values('Housekeeping', '40000');
insert into department values('Food and Beverage', '23000');
insert into department values('Kitchen or Food Production', '540000');
insert into department values('Security', '320000');

SELECT * FROM department;

