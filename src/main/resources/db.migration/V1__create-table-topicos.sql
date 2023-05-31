create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(500) not null,
    data_criacao DATE not null,
    status varchar(100) not null,
    nome_curso varchar(100) not null,
    categoria_curso varchar(100) not null,

    primary key(id)

);