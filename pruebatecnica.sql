create table usuario (
id serial primary key not null,
email varchar(45),
gusto_musical varchar(45)
);

drop table usuario ;

select * from usuario;

insert into usuario(email, gusto_musical) values('ignacio.thomson.97@gmail.com', 'Rock');