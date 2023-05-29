create table topicos (

id bigint not null auto_increment,
    nome varchar(100) not null,
    mensagem varchar(100) not null unique,
    data_criacao date not null,
    status_topico varchar(100) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)

);