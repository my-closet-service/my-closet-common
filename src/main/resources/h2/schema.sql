create table test(seq number(5) primary key);


CREATE TABLE CLOSET (
    USER_ID VARCHAR(20) ,
    SEQ NUMERIC AUTO_INCREMENT NOT NULL,
    CTG_L VARCHAR(2) NOT NULL,
    CTG_M VARCHAR(4) NOT NULL,
    COLOR VARCHAR(4) NOT NULL,
    FILTER  VARCHAR(4) ,
    FILTER2 VARCHAR(4) ,
    MEMO    TEXT ,
 	REGDATE  TIMESTAMP NOT NULL,   
 	UPDDATE  TIMESTAMP NOT NULL ,  
 	CONSTRAINT CLSET_PK PRIMARY KEY (USER_ID, SEQ)
) ;

CREATE TABLE CODI_M (
    USER_ID 	VARCHAR(20) ,
    SEQ 		NUMERIC AUTO_INCREMENT NOT NULL,
    PUBLIC_YN 	VARCHAR(1) NOT NULL,
    MEMO    	TEXT ,
 	REGDATE  	TIMESTAMP NOT NULL,   
 	UPDDATE  	TIMESTAMP NOT NULL ,  
 	CONSTRAINT CODI_M_PK PRIMARY KEY (USER_ID, SEQ)
) ;

CREATE TABLE CODI_D (
    CODI_SEQ 	NUMERIC NOT NULL,
    CLOSET_SEQ 	NUMERIC NOT NULL,
 	CONSTRAINT  CODI_D_PK PRIMARY KEY (CODI_SEQ, CLOSET_SEQ),
 	FOREIGN KEY (CODI_SEQ) REFERENCES CODI_M (SEQ),
	FOREIGN KEY (CLOSET_SEQ) REFERENCES CLOSET (SEQ)

) ;




