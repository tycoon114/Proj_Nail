drop table board_comment;
create table board_comment (
	COMMENT_NUM NUMBER NOT NULL,
  	COMMENT_BOARD NUMBER NOT NULL,
  	COMMENT_ID VARCHAR2(15),
  	COMMENT_DATE DATE,
  	COMMENT_PARENT NUMBER,
 	COMMENT_CONTENT VARCHAR2(1000) NOT NULL,
  	CONSTRAINT PK_comment PRIMARY KEY(COMMENT_NUM),
 	CONSTRAINT FK_comment FOREIGN KEY(COMMENT_BOARD) REFERENCES MOVIEBOARD(BOARDNUM)
);

drop sequence comment_seq;
create sequence COMMENT_SEQ;


commit