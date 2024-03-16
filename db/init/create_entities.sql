

CREATE TABLE IF NOT EXISTS tpp_ref_product_class
(
    internal_id serial PRIMARY KEY ,
    val VARCHAR(100) UNIQUE NOT NULL,
    gbi_code VARCHAR(50),
    gbi_name VARCHAR(100),
    product_row_code VARCHAR(50),
    product_row_name VARCHAR(100),
    subclass_code VARCHAR(50),
    subclass_name VARCHAR(100)
);


CREATE TABLE IF NOT EXISTS tpp_ref_product_register_type
(
    internal_id serial PRIMARY KEY ,
    val VARCHAR(100) UNIQUE NOT NULL,
    register_type_name VARCHAR(100) NOT NULL,
    product_class_code VARCHAR(100) NOT NULL
);
ALTER TABLE tpp_ref_product_register_type
    ADD FOREIGN KEY (product_class_code) REFERENCES tpp_ref_product_class (val);


CREATE TABLE IF NOT EXISTS product_register
(
    id serial PRIMARY KEY ,
    product_id BIGINT,
    type VARCHAR(100) NOT NULL,
    account BIGINT
);

ALTER TABLE product_register
    ADD FOREIGN KEY (type) REFERENCES tpp_ref_product_register_type (val);



CREATE TABLE IF NOT EXISTS tpp_ref_account_pool(
                                           id serial PRIMARY KEY,
                                           branch_code VARCHAR(50),
                                           currency_code VARCHAR(30),
                                           mdm_code VARCHAR(50),
                                           priority_code VARCHAR(30),
                                           registry_type_code VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS account(
                                      id serial PRIMARY KEY,
                                      account_pool_id BIGINT,
                                      account_number VARCHAR(25)
    --,bussy BOOLEAN
);

ALTER TABLE product_register
    ADD FOREIGN KEY (account) REFERENCES account (id);

ALTER TABLE account
    ADD FOREIGN KEY (account_pool_id) REFERENCES tpp_ref_account_pool (id);
--ON DELETE CASCADE;

--CREATE TABLE IF NOT EXISTS tpp_template_register_balance
--(
--	id serial PRIMARY KEY ,
--	register_id BIGINT,
--	amount DECIMAL,
--    "order" VARCHAR(50),
--    last_modify_date TIMESTAMP
--);

CREATE TABLE IF NOT EXISTS product
(
    id serial PRIMARY KEY,
    product_code_id BIGINT,
    client_id BIGINT,
    number VARCHAR(50),
    priority BIGINT,
    date_of_conclusion TIMESTAMP,
    start_date_time TIMESTAMP,
    end_date_time TIMESTAMP,
    days BIGINT,
    penalty_rate DECIMAL,
    nso DECIMAL,
    threshold_amount DECIMAL,
    requisite_type VARCHAR(50),
    interest_rate_type VARCHAR(50),
    tax_rate DECIMAL,
    reasone_close VARCHAR(100),
    state VARCHAR(50)
);

ALTER TABLE product_register
    ADD FOREIGN KEY (product_id) REFERENCES product (id);

CREATE TABLE IF NOT EXISTS agreement
(
    id serial PRIMARY KEY,
    product_id BIGINT,
    general_agreement_id VARCHAR(50),
    supplementary_agreement_id VARCHAR(50),
    arrangement_type VARCHAR(50),
    sheduler_job_id BIGINT,
    number VARCHAR(50),
    opening_date TIMESTAMP,
    closing_date TIMESTAMP,
    cancel_date TIMESTAMP,
    validity_duration BIGINT,
    cancellation_reason VARCHAR(100),
    status VARCHAR(50),
    interest_calculation_date TIMESTAMP,
    interest_rate DECIMAL,
    coefficient DECIMAL,
    coefficient_action VARCHAR(50),
    minimum_interest_rate DECIMAL,
    minimum_interest_rate_coefficient DECIMAL,
    minimum_interest_rate_coefficient_action VARCHAR(50),
    maximal_interest_rate DECIMAL,
    maximal_interest_rate_coefficient DECIMAL,
    maximal_interest_rate_coefficient_action VARCHAR(50)
);

ALTER TABLE agreement
    ADD FOREIGN KEY (product_id) REFERENCES product (id);
