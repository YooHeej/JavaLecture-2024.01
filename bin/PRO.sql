SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS dog;
DROP TABLE IF EXISTS liked;
DROP TABLE IF EXISTS gallery;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE board
(
	boardId int NOT NULL AUTO_INCREMENT,
	title varchar(255),
	content varchar(4000),
	modTime datetime DEFAULT CURRENT_TIMESTAMP,
	isDeleted int,
	viewCount int,
	replyCount int,
	userId int NOT NULL,
	PRIMARY KEY (boardId)
);


CREATE TABLE dog
(
	dogId int NOT NULL AUTO_INCREMENT,
	bDate date,
	breed varchar(255) NOT NULL,
	gender varchar(255),
	dname varchar(255),
	userId int NOT NULL,
	PRIMARY KEY (dogId)
);


CREATE TABLE gallery
(
	galleryId int NOT NULL AUTO_INCREMENT,
	title varchar(255) NOT NULL,
	content varchar(4000),
	isDeleted int DEFAULT 0,
	viewCount int DEFAULT 0,
	replyCount int DEFAULT 0,
	fName varchar(255),
	userId int NOT NULL,
	PRIMARY KEY (galleryId)
);


CREATE TABLE item
(
	itemId int NOT NULL AUTO_INCREMENT,
	price int NOT NULL,
	itemName varchar(255) NOT NULL,
	iType varchar(255) DEFAULT 'etc' NOT NULL,
	note varchar(2000),
	fName varchar(255),
	PRIMARY KEY (itemId)
);


CREATE TABLE liked
(
	likedId int NOT NULL AUTO_INCREMENT,
	galleryId int NOT NULL,
	userId int NOT NULL,
	PRIMARY KEY (likedId)
);


CREATE TABLE reply
(
	replyId int NOT NULL AUTO_INCREMENT,
	comment varchar(2000) NOT NULL,
	regTime datetime DEFAULT CURRENT_TIMESTAMP,
	userId int NOT NULL,
	boardId int NOT NULL,
	PRIMARY KEY (replyId)
);


CREATE TABLE user
(
	userId int NOT NULL AUTO_INCREMENT,
	uId varchar(255) NOT NULL,
	pwd varchar(255) NOT NULL,
	uname varchar(255) NOT NULL,
	email varchar(255),
	regDate date DEFAULT CURRENT_DATE,
	isDeleted int DEFAULT 0,
	balance int DEFAULT 0,
	PRIMARY KEY (userId)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (boardId)
	REFERENCES board (boardId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE liked
	ADD FOREIGN KEY (galleryId)
	REFERENCES gallery (galleryId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (userId)
	REFERENCES user (userId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE dog
	ADD FOREIGN KEY (userId)
	REFERENCES user (userId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE gallery
	ADD FOREIGN KEY (userId)
	REFERENCES user (userId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE liked
	ADD FOREIGN KEY (userId)
	REFERENCES user (userId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (userId)
	REFERENCES user (userId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



