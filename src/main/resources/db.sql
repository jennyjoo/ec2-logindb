
DESC MEMBER;

DROP TABLE member;
CREATE TABLE MEMBER (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id varchar(255) NOT NULL,
    user_pw varchar(255) NOT NULL,
    user_name varchar(255),
    user_role varchar(255) DEFAULT 'ROLE_USER',
    join_date date DEFAULT (CURRENT_DATE)
);

DESC MEMBER;

INSERT INTO MEMBER VALUES(0, 'hong', '1234', '홍길동', 'ROLE_USER', '')