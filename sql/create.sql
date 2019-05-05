DROP TABLE IF EXISTS vote CASCADE;
DROP TABLE IF EXISTS book CASCADE;
DROP TABLE IF EXISTS author CASCADE;
DROP TABLE IF EXISTS genre CASCADE;
DROP TABLE IF EXISTS publisher CASCADE;

CREATE TABLE author
(
  id        bigint(20)   not null auto_increment,
  full_name varchar(300) NOT NULL,
  birthday  DATE         NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE genre
(
  id     bigint(20)   not null AUTO_INCREMENT,
  name   VARCHAR(100) NOT NULL,
  parent BIGINT(20) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE publisher
(
  id   bigint(20)   not null AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE book
(
  id           bigint(20)   NOT NULL AUTO_INCREMENT,
  name         varchar(45)  NOT NULL,
  content      longblob     NOT NULL,
  page_count   int(11)      NOT NULL,
  isbn         VARCHAR(100) NOT NULL,
  genre_id     BIGINT(20)   NOT NULL,
  author_id    BIGINT(20)   NOT NULL,
  publish_year INT(11)      NOT NULL,
  publisher_id BIGINT(20)   NOT NULL,
  image        LONGBLOB      DEFAULT NULL,
  description  varchar(5000) DEFAULT NULL,
  rating       INT(5)        DEFAULT 0,
  vote_count   BIGINT(20)    DEFAULT 0,
  PRIMARY KEY (id),
  CONSTRAINT book_unique UNIQUE (id, isbn),
  FOREIGN KEY (author_id) REFERENCES author (id),
  FOREIGN KEY (genre_id) REFERENCES genre (id),
  FOREIGN KEY (publisher_id) REFERENCES publisher (id)
);



CREATE TABLE vote
(
  id       bigint(20)   not null AUTO_INCREMENT,
  value    INT(5) DEFAULT 0,
  book_id  BIGINT(20)   NOT NULL,
  username VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (book_id) REFERENCES book (id)
  #   FOREIGN KEY (username) REFERENCES
);