INSERT INTO USER_ROLE (name) VALUES
('Admin'),
('User');
INSERT INTO ENTRY_TAG (name) VALUES
('HomeOffice'),
('auswärtiges Arbeiten'),
('Bagen');

INSERT INTO USER (username, password, user_role_id)  VALUES
('Ray','123','1'),
('Mon','123','1'),
('RaDy','123','2'),
('Rasy','123','1'),
('cay','123','1');

INSERT INTO ENTRY ( CHECK_IN, CHECK_OUT, ENTRY_TAG_ID, USER_ID) VALUES
(CURRENT_DATE , CURRENT_DATE , '1' , '1'),
(CURRENT_DATE , CURRENT_DATE , '1' , '1'),
(CURRENT_DATE , CURRENT_DATE , '2' , '1'),
(CURRENT_DATE , CURRENT_DATE , '2' , '1'),
(CURRENT_DATE , CURRENT_DATE , '1' , '2'),
(CURRENT_DATE , CURRENT_DATE , '1' , '2'),
(CURRENT_DATE , CURRENT_DATE , '2' , '2'),
(CURRENT_DATE , CURRENT_DATE , '2' , '2'),
(CURRENT_DATE , CURRENT_DATE , '1' , '4'),
(CURRENT_DATE , CURRENT_DATE , '2' , '4'),
(CURRENT_DATE , CURRENT_DATE , '1' , '1'),
(CURRENT_DATE , CURRENT_DATE , '2' , '1');