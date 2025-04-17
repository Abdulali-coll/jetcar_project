CREATE TABLE IF NOT EXISTS cars (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(255) NOT NULL,
  image         VARCHAR(512),
  image_any     VARCHAR(512),
  image_back    VARCHAR(512),
  price         VARCHAR(50),
  mileage       INTEGER,
  power         INTEGER,
  engine_type   VARCHAR(100),
  description   TEXT,
  year          INTEGER
);
