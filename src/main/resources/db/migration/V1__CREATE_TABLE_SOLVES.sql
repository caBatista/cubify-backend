CREATE TABLE solves (
    id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    time TIME NOT NULL,
    scramble TEXT NOT NULL,
    valid BOOLEAN NOT NULL
);