-- CREATE DATABASE academy;
-- USE academy;
-- CREATE TABLE manager(
-- id int NOT NULL AUTO_INCREMENT,
-- name varchar(50) NOT NULL,
-- PRIMARY KEY(id)
-- );

-- CREATE TABLE trainer(
-- id int NOT NULL AUTO_INCREMENT,
-- name varchar(50) NOT NULL,
-- manager_id int,
-- PRIMARY KEY(id),
-- FOREIGN KEY (manager_id) REFERENCES manager(id)
-- );

-- CREATE TABLE recruiter(
-- id int NOT NULL AUTO_INCREMENT,
-- name varchar(50) NOT NULL,
-- manager_id int,
-- PRIMARY KEY(id),
-- FOREIGN KEY (manager_id) REFERENCES manager(id) 
-- );

-- CREATE TABLE trainee(
-- id int NOT NULL AUTO_INCREMENT,
-- name varchar(50) NOT NULL,
-- manager_id int,
-- recruiter_id int,
-- PRIMARY KEY(id),
-- FOREIGN KEY (manager_id) REFERENCES manager(id),
-- FOREIGN KEY (recruiter_id) REFERENCES recruiter(id)
-- );

-- CREATE TABLE trainer_trainee(
-- id int NOT NULL AUTO_INCREMENT,
-- trainer_id int,
-- trainee_id int,
-- PRIMARY KEY (id),
-- FOREIGN KEY (trainer_id) REFERENCES trainer(id),
-- FOREIGN KEY (trainee_id) REFERENCES trainee(id)
-- );

CREATE TABLE test(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
manager_id int,
recruiter_id int,
name_manager varchar(50),
PRIMARY KEY(id),
FOREIGN KEY (manager_id) REFERENCES manager(id),
FOREIGN KEY (recruiter_id) REFERENCES recruiter(id),
FOREIGN KEY (manager_id) REFERENCES manager(id)
);

-- ALTER TABLE manager ADD personality varchar(25);
