CONNECT QUOTES;

DROP TABLE CATEGORY;
CREATE TABLE CATEGORY (
CATEGORY VARCHAR(200) NOT NULL,
CATEGORY_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT CATEGORY_ID_PK PRIMARY KEY
);

DROP TABLE AUTHOR;
CREATE TABLE AUTHOR ( 
FIRST_NAME VARCHAR(30) NOT NULL,
LAST_NAME VARCHAR(30) NOT NULL,
AUTHOR_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT AUTHOR_ID_PK PRIMARY KEY
);


DROP TABLE QUOTE;
CREATE TABLE QUOTE (
TEXT VARCHAR(200) NOT NULL,
AUTHOR_ID INTEGER,
QUOTE_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT QUOTE_ID_PK PRIMARY KEY
);

!--the following tables are just for joining

DROP TABLE CATEGORY_QUOTE;
CREATE TABLE CATEGORY_QUOTE (
CATEGORY_ID INTEGER,
QUOTE_ID INTEGER,
);

DROP TABLE CATEGORY_AUTHOR;
CREATE TABLE CATEGORY_AUTHOR (
CATEGORY_ID INTEGER,
AUTHOR_ID INTEGER,
);
