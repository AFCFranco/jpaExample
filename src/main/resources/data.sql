insert into book (id,title) values (10001,'El aleph');
insert into book (id,title) values (10002,'El remordimiento');
insert into book (id,title) values (10003,'viaje a pie');

insert into writer (id,name,birth_day) values (10002,'Borges',date '1987-09-09');
insert into writer (id,name,birth_day) values (10003,'Gonsalez',date '1937-1-19');
insert into writer (id,name,birth_day) values (10004,'Harari',date '1987-09-09');


insert into Book_Writer (id,book_id,writer_id) values (1001,10001,10002);
insert into Book_writer (id,book_id,writer_id) values (1002,10002,10003);
insert into Book_writer (id,book_id,writer_id) values (1003,10003,10003);
