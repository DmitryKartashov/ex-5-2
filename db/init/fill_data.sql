INSERT INTO public.tpp_ref_product_class (internal_id,gbl_code,gbl_name,product_row_code,product_row_name,subclass_code,subclass_name,value)

VALUES (1,'03.012.002','03','Розничный бизнес','012','Драг. металлы','002','Хранение');

INSERT INTO tpp_ref_product_class (id,gbl_code,gbl_name,product_row_code,product_row_name,subclass_code,subclass_name,value)

VALUES (2,'02.001.005','02','Розничный бизнес','001','Драг. металлы','005','Продажа');


INSERT INTO tpp_ref_product_register_type (id, account_type,product_class_id,register_type_name,value)

VALUES (1,'Клиентский',1,'Хранение ДМ.','03.012.002_47533_ComSoLd')

INSERT INTO tpp_ref_product_register_type (id, account_type,product_class_id,register_type_name,value)

VALUES (2,'Клиентский',2,'Серебро. Выкуп.','02.001.005_45343_CoDowFF')

INSERT INTO account_pool (id,branch_code ,currency_code,mdm_code,priority_code,registry_type_code)

VALUES (1,'022','800','15','00','03.012.002_47533_ComSoLd')

INSERT INTO account_pool (id,branch_code ,currency_code,mdm_code,priority_code,registry_type_code)

VALUES (2,'021','500','13','00','02.001.005_45343_CoDowFF')

INSERT INTO account_pool (id, account_type,product_class_id,register_type_name,value);

VALUES (1,'Клиентский',1,'Хранение ДМ.','03.012.002_47533_ComSoLd');

INSERT INTO account_pool (id, account_type,product_class_id,register_type_name,value)

VALUES (2,'Клиентский',2,'Серебро. Выкуп.','02.001.005_45343_CoDowFF');

INSERT INTO accounts(account_pool_id, accounts)
VALUES (2,'4753352543276345')