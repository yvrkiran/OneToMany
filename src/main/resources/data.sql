INSERT INTO EMPLOYEE VALUES (EMPID_SEQ.NEXTVAL, 'Revon','Desilva');
INSERT INTO ADDRESS (ID, CITY, STATE, STREET, EMPID) VALUES
    (ADDRESS_ID_SEQ.NEXTVAL, 'Des Moines','IA','1100 Locust',(select empid from employee where First_name like 'Revon'));
INSERT INTO ADDRESS (ID, CITY, STATE, STREET, EMPID) VALUES
    (ADDRESS_ID_SEQ.NEXTVAL, 'Clive','IA','15500 Boston Prkwy',(select empid from employee where First_name like 'Revon'));

INSERT INTO EMPLOYEE VALUES (EMPID_SEQ.NEXTVAL, 'Ravi','Kiran');
INSERT INTO ADDRESS (ID, CITY, STATE, STREET, EMPID) VALUES
    (ADDRESS_ID_SEQ.NEXTVAL, 'St. Louis Park','MN','301 Shelard',(select empid from employee where First_name like 'Ravi'));

INSERT INTO EMPLOYEE VALUES (EMPID_SEQ.NEXTVAL, 'RS','Ganesh');
INSERT INTO ADDRESS (ID, CITY, STATE, STREET, EMPID) VALUES
    (ADDRESS_ID_SEQ.NEXTVAL, 'DSM','IA','15400 Boston',(select empid from employee where First_name like 'RS'));

INSERT INTO EMPLOYEE VALUES (EMPID_SEQ.NEXTVAL, 'Karthik','Subbu');
INSERT INTO EMPLOYEE VALUES (EMPID_SEQ.NEXTVAL, 'Sathish','Kumar');