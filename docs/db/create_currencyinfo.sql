
CREATE TABLE demo.currencyinfo (
	ID INT auto_increment NOT NULL COMMENT '流水號',
	CODE varchar(20) NOT NULL COMMENT '幣別代碼',
	NAME varchar(100) NOT NULL COMMENT '中文名稱',
	CONSTRAINT CurrencyInfo_pk PRIMARY KEY (ID)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci
COMMENT='幣別相關資訊';

