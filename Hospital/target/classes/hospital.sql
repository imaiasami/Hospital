-- 테이블 생성
CREATE TABLE DOCTOR (
    SEQ_DOC     NUMBER       PRIMARY KEY,
    NAME        VARCHAR2(50) NOT NULL,
    PHONE       VARCHAR2(30),
    DEPT        VARCHAR2(50),
    POST        VARCHAR2(50),
    SSN         VARCHAR2(30) UNIQUE
);

CREATE TABLE PATIENT (
    SEQ_PAT     NUMBER      PRIMARY KEY,
    NAME        VARCHAR2(50) NOT NULL,
    PHONE       VARCHAR2(30),
    SSN         VARCHAR2(30) UNIQUE
);

CREATE TABLE RESERVATION (
    SEQ_RES     NUMBER      PRIMARY KEY,
    SEQ_PAT     NUMBER      REFERENCES PATIENT(SEQ_PAT),
    SEQ_DOC     NUMBER      REFERENCES DOCTOR(SEQ_DOC),
    TIME        DATE
);

CREATE TABLE SCHEDULE (
    SEQ_DOC     NUMBER      REFERENCES DOCTOR(SEQ_DOC),
    YEAR        NUMBER      NOT NULL,
    MONTH       NUMBER      NOT NULL,
    D01         NUMBER      DEFAULT 0,
    D02         NUMBER      DEFAULT 0,
    D03         NUMBER      DEFAULT 0,
    D04         NUMBER      DEFAULT 0,
    D05         NUMBER      DEFAULT 0,
    D06         NUMBER      DEFAULT 0,
    D07         NUMBER      DEFAULT 0,
    D08         NUMBER      DEFAULT 0,
    D09         NUMBER      DEFAULT 0,
    D10         NUMBER      DEFAULT 0,
    D11         NUMBER      DEFAULT 0,
    D12         NUMBER      DEFAULT 0,
    D13         NUMBER      DEFAULT 0,
    D14         NUMBER      DEFAULT 0,
    D15         NUMBER      DEFAULT 0,
    D16         NUMBER      DEFAULT 0,
    D17         NUMBER      DEFAULT 0,
    D18         NUMBER      DEFAULT 0,
    D19         NUMBER      DEFAULT 0,
    D20         NUMBER      DEFAULT 0,
    D21         NUMBER      DEFAULT 0,
    D22         NUMBER      DEFAULT 0,
    D23         NUMBER      DEFAULT 0,
    D24         NUMBER      DEFAULT 0,
    D25         NUMBER      DEFAULT 0,
    D26         NUMBER      DEFAULT 0,
    D27         NUMBER      DEFAULT 0,
    D28         NUMBER      DEFAULT 0,
    D29         NUMBER      DEFAULT 0,
    D30         NUMBER      DEFAULT 0,
    D31         NUMBER      DEFAULT 0
);

-- 시퀀스 생성
CREATE SEQUENCE SEQ_DOC;
CREATE SEQUENCE SEQ_PAT;
CREATE SEQUENCE SEQ_RES;

-- 테이블 삭제(반드시 순서대로)
DROP TABLE SCHEDULE;
DROP TABLE RESERVATION;
DROP TABLE PATIENT;
DROP TABLE DOCTOR;

-- 테이블에 컬럼 추가(예시)
-- ALTER TABLE SCHEDULE ADD W202401 NUMBER DEFAULT 0;

drop table doctor;
drop table reservation;
drop table schedule;
drop table patient;

select * from doctor;
select * from patient;
select * from reservation;
select * from schedule;

delete from schedule;
delete from doctor;
delete from patient;
delete from reservation;

rollback;

commit;