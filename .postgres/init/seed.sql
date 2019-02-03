CREATE TABLE IF NOT EXISTS example_table (
  id serial PRIMARY KEY,
 username VARCHAR (50) UNIQUE NOT NULL,
 created_on TIMESTAMP NOT NULL
);
