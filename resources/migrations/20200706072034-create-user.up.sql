CREATE TABLE IF NOT EXISTS users (
    id            BIGINT NOT NULL,
    username      VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL
)