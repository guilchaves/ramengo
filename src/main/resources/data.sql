DROP TABLE IF EXISTS tb_protein;
DROP TABLE IF EXISTS tb_broth;

CREATE TABLE tb_protein (
    id BIGINT PRIMARY KEY,
    image_inactive VARCHAR(255),
    image_active VARCHAR(255),
    name VARCHAR(255),
    description VARCHAR(255),
    price DOUBLE
);

CREATE TABLE tb_broth (
    id BIGINT PRIMARY KEY,
    image_inactive VARCHAR(255),
    image_active VARCHAR(255),
    name VARCHAR(255),
    description VARCHAR(255),
    price DOUBLE
);

INSERT INTO tb_protein (id, image_inactive, image_active, name, description, price) VALUES
(1, 'https://tech.redventures.com.br/icons/pork/inactive.svg', 'https://tech.redventures.com.br/icons/pork/active.svg', 'Chasu', 'A sliced flavourful pork meat with a selection of season vegetables.', 10.0),
(2, 'https://tech.redventures.com.br/icons/yasai/inactive.svg', 'https://tech.redventures.com.br/icons/yasai/active.svg', 'Yasai Vegetarian', 'A delicious vegetarian lamen with a selection of season vegetables.', 10.0),
(3, 'https://tech.redventures.com.br/icons/chicken/inactive.svg', 'https://tech.redventures.com.br/icons/chicken/active.svg', 'Karaague', 'Three units of fried chicken, moyashi, ajitama egg and other vegetables.', 12.0);

INSERT INTO tb_broth (id, image_inactive, image_active, name, description, price) VALUES
(1, 'https://tech.redventures.com.br/icons/salt/inactive.svg', 'https://tech.redventures.com.br/icons/salt/active.svg', 'Salt', 'Simple like the seawater, nothing more', 10.0),
(2, 'https://tech.redventures.com.br/icons/shoyu/inactive.svg', 'https://tech.redventures.com.br/icons/shoyu/active.svg', 'Shoyu', 'The good old and traditional soy sauce', 10.0),
(3, 'https://tech.redventures.com.br/icons/miso/inactive.svg', 'https://tech.redventures.com.br/icons/miso/active.svg', 'Miso', 'Paste made of fermented soybeans', 12.0);
