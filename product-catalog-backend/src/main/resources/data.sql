DELETE FROM product; -- Wipe existing (if any) table clean before inserting (safe for local dev environment)

INSERT INTO product (id, name, description, price, image_url) VALUES (1, 'Smart Laptop', 'laptop', 12999.99, '/images/product-catalog-laptop-img.jpg');
INSERT INTO product (id, name, description, price, image_url) VALUES (2, 'Headphones', 'Over-ear headphones', 1999.50, '/images/product-catalog-wireless-headphones-img.jpg');
INSERT INTO product (id, name, description, price, image_url) VALUES (3, 'Keyboard', 'Gaming keyboard', 899.95, '/images/product-catalog-keyboard-img.jpg');
INSERT INTO product (id, name, description, price, image_url) VALUES(4, 'Monitor', 'monitor with HDR support', 3499.00, '/images/product-catalog-monitor-img.jpg');
INSERT INTO product (id, name, description, price, image_url) VALUES(5, 'Office Chair', 'mesh chair', 2755.00, '/images/product-catalog-chair-img.jpg');