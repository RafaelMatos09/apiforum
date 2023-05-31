create table respostas(

    id bigint not null auto_increment,
    mensagem varchar(100) not null,
    data_criacao DATE not null unique,
    solucao tinyint

    primary key(id)

);