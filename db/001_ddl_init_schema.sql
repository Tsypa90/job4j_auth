create table if not exists person (
    id serial primary key not null,
    login varchar(2000),
    password varchar(2000)
);

create table if not exists employee (
    id serial primary key,
    name varchar(225),
    surname varchar(225),
    tax_identifier integer,
    hire_date timestamp default now()
);

create table if not exists employees_persons (
    employee_id integer references employees(id),
    person_id integer references  person(id)
)