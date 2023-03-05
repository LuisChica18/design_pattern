
-- Create table for postgresql and mysql
-- databases: design_patterns
create table products(
                         product_id INTEGER not null,
                         product_name VARCHAR(100),
                         product_price numeric(5,2)
);