USE academy;
INSERT INTO manager (name) VALUES('Chris');
INSERT INTO recruiter (name) VALUES('Gary');
INSERT INTO trainee (name) VALUES('D');
INSERT INTO trainer (name) VALUES('S');

UPDATE trainer
SET manager_id = 4
WHERE id = 2;

SELECT * FROM manager, recruiter, trainer, trainee;
DELETE FROM manager WHERE id = 6;
SELECT name FROM manager;
SELECT DISTINCT name FROM manager;

SELECT * FROM trainee;

SELECT COUNT(name) FROM manager; 
SELECT SUM(id) WHERE DISTINCT name LIKE '%s%' FROM manager;

DROP DATABASE academy;

SELECT * FROM manager;

SELECT name FROM trainer WHERE manager_id = (SELECT id FROM manager WHERE name = 'John');

SELECT trainer.name, manager.name FROM trainer JOIN manager ON trainer.manager_id=manager.id;