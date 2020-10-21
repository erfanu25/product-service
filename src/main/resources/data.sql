

INSERT INTO products (id, create_date, price, product_name) VALUES
(1, '2020-10-21 14:58:04', 120, 'Mango'),
(2, '2020-10-21 14:45:06', 68, 'Rice'),
(3, '2020-10-21 14:55:34', 90, 'Vagitable');



INSERT INTO roles (id, name) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_MODERATOR'),
(3, 'ROLE_ADMIN');


INSERT INTO users (id, email, password, username) VALUES
(1, 'mderfan2@gmail.com', '$2a$10$0oev.lWIno0JBmmtrmvCDOMcmWYipyAYTd2xHZSIq/HrxPD.Incjq', 'erfan'),
(2, 'rifat@gmail.com', '$2a$10$c1VPn6KxsGBycysEM3jZ2O/ejFgF33PwLb7BMfWxeE4uoYcYQZJbu', 'rifat'),
(3, 'fahim@gmail.com', '$2a$10$n2vs5DeR59WBzYTPMQOereCoUwhPaXpQ/noU1eA6RoZ1eZ6PHEKu.', 'fahim');



INSERT INTO user_roles (user_id, role_id) VALUES
(1, 3),
(2, 2),
(3, 1);


