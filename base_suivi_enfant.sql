CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;
create table corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT
    poids float,
    taille float,
    imc float,
    date DATE
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfant) ON DELETE CASCADE
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

CREATE TABLE enfants (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    date_naissance DATE,
    sexe ENUM ('garçon', 'fille') NOT NULL
);

CREATE TABLE admins (
     id_admin INT PRIMARY KEY, FOREIGN KEY (id_admin) references utilisateur(id);
);



CREATE TABLE IF NOT EXISTS questions (

    id_question INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    type_capacite ENUM('Logique', 'Memoire', 'Attention'),
    delai_max INT
);

CREATE TABLE options (
    id_option INT PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(255) NOT NULL,
    est_correct BOOLEAN,
    
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
    id_eveluation INT PRIMARY KEY AUTO_INCREMENT,
    type_ctivite VARCHAR(25) NOT NULL,
    score INT not null,
    scrore_global INT not null,
    date_evaluation DATE not null,
);

CREATE TABLE parents(
    id_parent int primary key, 
    genre varchar(10), 
    ADD CONSTRAINT fk_pr FOREIGN key(id_parent) REFERENCES utilisateur(id));

CREATE TABLE specialistes(
    id_specialiste, 
    specialite varchar(20), 
    ADD CONSTRAINT fk_pr FOREIGN key(id_specialiste) REFERENCES utilisateur(id));

 CREATE TABLE recommandations (
    id_recommandation INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandation DATE NOT NULL,
    type VARCHAR(100) NOT NULL
    id_eveluation INT,
    FOREIGN KEY (id_eveluation) REFERENCES evaluation(id_eveluation)
);

CREATE TABLE question_quiz(
    id_question INT ,
    id_quiz INT,
    primary key(id_question,id_quiz),
    
    foreign key (id_question) references Question(id_question) on delete cascade,
    foreign key (id_quiz) references quiz(id_quiz) on delete cascade

);