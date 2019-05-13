INSERT INTO `spring_library`.author (full_name, birthday) VALUES ('name lastname1', '1999-01-01');
INSERT INTO `spring_library`.author (full_name, birthday) VALUES ('name lastname2', '1999-01-01');
INSERT INTO `spring_library`.author (full_name, birthday) VALUES ('name lastname3', '1999-01-01');

INSERT INTO `spring_library`.genre (name) VALUES ('some genre2');
INSERT INTO `spring_library`.genre (name) VALUES ('some genre3');
INSERT INTO `spring_library`.genre (name) VALUES ('some genre2');

INSERT INTO `spring_library`.publisher (name) VALUES ('some publisher1');
INSERT INTO `spring_library`.publisher (name) VALUES ('some publisher2');
INSERT INTO `spring_library`.publisher (name) VALUES ('some publisher3');

INSERT INTO `spring_library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id, image) VALUES ('book name1', ?, '123', '123-123-123-123', '1', '1', '1999', '1', ?);
INSERT INTO `spring_library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id, image) VALUES ('book name2', ?, '223', '223-123-123-123', '2', '2', '1999', '2', ?);
INSERT INTO `spring_library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id, image) VALUES ('book name3', ?, '323', '323-123-123-123', '3', '3', '1999', '3', ?);

# INSERT INTO `spring_library`.book (name, content, page_count, isbn, genre_id, author_id, publish_year, publisher_id) VALUES ('book name', ?, '123', '123-123-123-123', '1', '1', '1999', '1');