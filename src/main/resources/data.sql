insert into customer_rewards(id, name) values (1, 'Monica');
insert into customer_rewards(id, name) values (2, 'Riya');

insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (1, 'Transaction 1', 71, '2021-07-01 17:00:00', 1);
insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (2, 'Transaction 2', 89, '2021-07-03 18:30:00', 1);
insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (3, 'Transaction 3', 95, '2021-07-15 19:20:00', 1);
insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (4, 'Transaction 4', 175, '2021-07-17 20:30:00', 1);
insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (5, 'Transaction 5', 67, '2021-07-21 09:10:00', 1);

insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (6, 'Transaction 1', 25.60, '2021-07-01 19:10:00', 2);
insert into my_transaction(id, description, total, purchase_date, customer_rewards_id) values (7, 'Transaction 2', 80.50, '2021-07-05 17:05:30', 2);
