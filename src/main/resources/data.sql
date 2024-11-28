insert into users(id, user_name, password)
values(1001, 'om', 'goonman');

insert into project(id, project, start_date, end_date, total_hours, users_id)
values(10002, 'springManager', Now(), NOW(), 1000, 1001);

insert into project(id, project, start_date, end_date, total_hours, users_id)
values(10003, 'SpringMVC', Now(), NOW(), 1000, 1001);