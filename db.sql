create table usuario (
	id int PRIMARY KEY AUTO_INCREMENT,
	nome varchar(200),
	email varchar(200)
)

create table restaurante (
	id int PRIMARY KEY AUTO_INCREMENT,
	usuario int not null,
	nome varchar(200),
	endereco varchar(200),
	bairro varchar(100),
	cidade varchar(100),
	uf varchar(2),
	disponivel boolean,
	FOREIGN KEY (usuario) REFERENCES usuario(id)
)

create table periodo (
	id int PRIMARY KEY AUTO_INCREMENT,
	restaurante int not null,
	descricao varchar(100),
	de varchar(20),
	ate varchar(20),
	FOREIGN KEY (restaurante) REFERENCES restaurante(id)
)

create table item (
	id int PRIMARY KEY AUTO_INCREMENT,
	restaurante int not null,
	descricao varchar(20),
	valor varchar(20),
	FOREIGN KEY (restaurante_id) REFERENCES restaurante(id)
)

create table proposta (
	id int PRIMARY KEY AUTO_INCREMENT,
	usuario int not null,
	restaurante int not null,
	periodo varchar(100) not null,
	de varchar(20) not null,
	ate varchar(20) not null,
	valor float not null,
	mensagem varchar(2000),
	status varchar(20),
	criacao datetime,
	atualizacao datetime,
	FOREIGN KEY (usuario) REFERENCES usuario(id),
	FOREIGN KEY (restaurante) REFERENCES restaurante(id)
)