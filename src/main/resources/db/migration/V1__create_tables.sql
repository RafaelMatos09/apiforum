CREATE TABLE usuarios(
                        id bigint not null auto_increment,
                        nome varchar(60) not null,
                        login varchar(255) not null,
                        senha varchar(255) not null,
                        ativo tinyint(1) DEFAULT 0,
                        primary key (id)
)engine=InnoDB default charset=utf8;

CREATE TABLE cursos (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       nome VARCHAR(255) NOT NULL,
                       categoria varchar(255) not null,
                       ativo tinyint(1) DEFAULT 0
)engine=InnoDB default charset=utf8;

CREATE TABLE topicos (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        titulo VARCHAR(255) NOT NULL,
                        mensagem VARCHAR(255) NOT NULL,
                        status varchar(50) not null,
                        data_criacao datetime not null,
                        ativo tinyint(1) DEFAULT 0,
                        autor_id BIGINT,
                        curso_id BIGINT,
                        FOREIGN KEY (autor_id) REFERENCES usuarios(id),
                        FOREIGN KEY (curso_id) REFERENCES cursos(id)
)engine=InnoDB default charset=utf8;

CREATE TABLE respostas (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          mensagem VARCHAR(255) NOT NULL,
                          topico_id BIGINT,
                          autor_id BIGINT,
                          data_criacao datetime not null,
                          solucao tinyint(1) DEFAULT 0,
                          ativo tinyint(1) DEFAULT 0,
                          FOREIGN KEY (topico_id) REFERENCES topicos(id),
                          FOREIGN KEY (autor_id) REFERENCES usuarios(id)
)engine=InnoDB default charset=utf8;
