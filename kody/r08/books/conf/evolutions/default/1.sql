# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        bigint not null,
  label                     varchar(255),
  constraint pk_book primary key (id))
;

create sequence book_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists book;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists book_seq;

