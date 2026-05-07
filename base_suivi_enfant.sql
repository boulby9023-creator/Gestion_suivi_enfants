CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;
create table corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT
    poids float,
    taille float,
    imc float,
    date_enregistrement DATE,
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE
    );

create table utilisateurs(
    id int primary key auto_increment,
    nom varchar(35) not null,
    prenom varchar(40) not null,
    tel varchar(25) unique not null,
    mail varchar(45) unique not null,
    mot_de_passe varchar(35) not null,
    roles enum('admin', 'parent', 'specialiste', 'enseignant') not null
    );

CREATE TABLE parents(
    id_parent int primary key, 
    genre varchar(10), 
    FOREIGN key(id_parent) REFERENCES utilisateur(id));

CREATE TABLE specialistes(
    id_specialiste int PRIMARY KEY, 
    specialite varchar(20), 
    FOREIGN key(id_specialiste) REFERENCES utilisateur(id));

CREATE TABLE enfants (
    id_enfants INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    date_naissance DATE,
    sexe ENUM ('garçon', 'fille') NOT NULL,
    id_activites int ,
    id_parent int,
    FOREIGN key(id_parent) REFERENCES parents(id_parent) ON DELETE CASCADE,
    FOREIGN key(id_activites) REFERENCES activites(id_activites) ON DELETE CASCADE
);

create table corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT NOT NULL,
    poids float NOT NULL,
    taille float NOT NULL,
    imc float NOT NULL,
    dates DATE NOT NULL,
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfant) ON DELETE CASCADE
    );

CREATE TABLE admins (
     id_admins INT PRIMARY KEY, FOREIGN KEY (id_admins) references utilisateur(id)
);



CREATE TABLE IF NOT EXISTS questions (

    id_questions INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    type_capacite ENUM('Logique', 'Memoire', 'Attention'),
    delai_max INT
);

CREATE TABLE options (
    id_options INT PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(255) NOT NULL,
    est_correct BOOLEAN,
    id_question int,
    FOREIGN KEY(id_question)REFERENCES questions(id_question) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS activites(
    id_activites INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50) NOT NULL,
    descriptions TEXT,
    age_min INT,
    age_max INT,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    type_activite ENUM("quiz","exercice","jeux") NOT NULL
);
CREATE TABLE IF NOT EXISTS quiz(
    id_quiz INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT FOREIGN KEY(id_quiz)REFERENCES activites(id_activites) ON DELETE CASCADE

);
CREATE TABLE evaluations(
    id_evaluation INT PRIMARY KEY AUTO_INCREMENT,
    type_ctivite VARCHAR(25) NOT NULL,
    score INT not null,
    scrore_global INT not null,
    date_evaluations DATE not null
);

CREATE TABLE parents(
    id_parents int primary key, 
    genre varchar(10), 
    CONSTRAINT fk_pr FOREIGN key(id_parents) REFERENCES utilisateur(id));

CREATE TABLE specialistes(
    id_specialistes INT primary key, 
    specialite varchar(20), 
    CONSTRAINT fk_pr FOREIGN key(id_specialistes) REFERENCES utilisateurs(id));

 CREATE TABLE recommandations (
    id_recommandations INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandations DATE NOT NULL,
    type_recommandations VARCHAR(100) NOT NULL,
    id_evaluations INT,
    FOREIGN KEY (id_evaluations) REFERENCES evaluations(id_evaluations)
);

CREATE TABLE question_quiz(
    id_questions INT,
    id_quiz INT,
    primary key(id_questions,id_quiz),
    
    foreign key (id_questions) references questions(id_questions),
    foreign key (id_quiz) references quiz(id_quiz)
);