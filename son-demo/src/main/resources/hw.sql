use homework;
CREATE table books(
	b_id int PRIMARY key,
	b_title varchar(255),
	b_anthor varchar(100),
	b_publisher varchar(255)
);
CREATE table publicsher(
	p_id int PRIMARY key,
	p_name varchar(255),
	P_addrs varchar(100),
	P_phone varchar(255)
);
CREATE table athors(
	a_id int PRIMARY key,
	a_name varchar(255),
	a_addrs varchar(100),
	a_phone varchar(255),
	a_sex varchar(5),
	a_age int
);
CREATE table cars(
	c_id int PRIMARY key,
	c_name varchar(255),
	c_color varchar(100),
	c_type int,
	c_doors int,
	c_boxs varchar(255)
);
CREATE table ba(
  id int PRIMARY KEY ,
  b_id int,
  a_id int
)

