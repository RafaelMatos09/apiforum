create table topicos (

id bigint not null auto_increment,
    nome varchar(100) not null,
    mensagem varchar(100) not null unique,
    data_criacao date not null,
    status_topico varchar(100) not null,
    curso_nome varchar(100) not null,
    categoria varchar(100) not null,

    primary key(id)

);