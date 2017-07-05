USE master
GO

IF NOT EXISTS(
	SELECT * 
	FROM sys.databases 
	WHERE name = 'dbBackEndTest'
	)
BEGIN
	CREATE DATABASE dbBackEndTest
END
GO



IF NOT EXISTS(
	SELECT * 
	FROM INFORMATION_SCHEMA.TABLES
	WHERE TABLE_SCHEMA = 'dbBackEndTest'
	AND TABLE_NAME = 'tb_customer_account'
	)
BEGIN
	USE dbBackEndTest
	CREATE TABLE tb_customer_account(
		id_customer INT IDENTITY(1,1) NOT NULL,
		cpf_cnpj VARCHAR(14),
		nm_customer VARCHAR(50),
		is_active bit,
		vl_total DECIMAL(9,2)
	);
	ALTER TABLE tb_customer_account
	ADD PRIMARY KEY (id_customer)
END
