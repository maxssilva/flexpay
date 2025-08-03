CREATE TABLE users (
    id uuid PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    user_type VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL
);
