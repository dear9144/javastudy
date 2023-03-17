DROP TABLE CONTACT_TBL;
CREATE TABLE CONTACT_TBL (
	CONTACT_NO NUMBER 			 NOT NULL,
	NAME  	   VARCHAR2(20 BYTE) NOT NULL,
	TEL		   VARCHAR2(20 BYTE) NULL,
	EMAIL	   VARCHAR2(99 BYTE) NULL,
	ADDRESS	   VARCHAR2(99 BYTE) NULL
);

ALTER TABLE CONTACT_TBL 
	ADD CONSTRAINT PK_CONTACT PRIMARY KEY(CONTACT_NO);

DROP SEQUENCE CONTACT_SEQ;
CREATE SEQUENCE CONTACT_SEQ NOCACHE;



SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS
 FROM CONTACT_TBL;
	