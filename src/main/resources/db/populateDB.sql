INSERT INTO `spring-library`.author (full_name, birthday) VALUES ('name lastname', '1999-01-01');

INSERT INTO `spring-library`.genre (name) VALUES ('some genre2');

INSERT INTO `spring-library`.publisher (name) VALUES ('some publisher');

INSERT INTO `spring-library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id, image) VALUES ('book name', ?, '123', '123-123-123-123', '1', '1', '1999', '1', ?);

INSERT INTO `spring-library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id) VALUES ('book name', ?, '123', '123-123-123-123', '1', '1', '1999', '1');