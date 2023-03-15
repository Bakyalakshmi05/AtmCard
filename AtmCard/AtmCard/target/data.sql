DROP TABLE IF EXISTS CardDetails;

CREATE TABLE `CardDetails`(
`card_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`card_number` BIGINT NOT NULL,
`card_type` varchar(100) NOT NULL,
`expire_date` date DEFAULT NULL
);

INSERT INTO `CardDetails`(`customer_id`,`card_number`,`card_type`,`expire_date`)
VALUES (10,'Credit_card',CURDATE());
INSERT INTO `CardDetails`(`customer_id`,`card_number`,`card_type`,`expire_date`)
VALUES (1,98877,'Debit_card',CURDATE());
INSERT INTO `CardDetails`(`customer_id`,`card_number`,`card_type`,`expire_date`)
VALUES (2,40056,'Credit_card',CURDATE());
INSERT INTO `CardDetails`(`customer_id`,`card_number`,`card_type`,`expire_date`)
VALUES (2,48875,'Debit_card',CURDATE());