SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS tbl;




/* Create Tables */

CREATE TABLE tbl
(
	id int NOT NULL AUTO_INCREMENT,
	name varchar(12) NOT NULL,
	PRIMARY KEY (id)
);



