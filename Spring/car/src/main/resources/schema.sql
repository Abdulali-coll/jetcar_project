CREATE TABLE IF NOT EXISTS brands (
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS cars (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(255) NOT NULL,
  image         VARCHAR(512),
  image_any     VARCHAR(512),
  image_back    VARCHAR(512),
  price         VARCHAR(50),
  mileage       INTEGER CHECK (mileage >= 0),
  power         INTEGER CHECK (power > 0),
  engine_type   VARCHAR(100),
  description   TEXT,
  year          INTEGER CHECK (year BETWEEN 1886 AND EXTRACT(YEAR FROM NOW())),
  brand_id      INTEGER REFERENCES brands(id) ON DELETE SET NULL
);