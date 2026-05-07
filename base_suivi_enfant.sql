CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;
create table corporelle (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT
    poids float,
    taille float,
    imc float,
    date DATE
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfant) ON DELETE CASCADE
    );

create table utilisateur(
    id int primary key auto_increment,
    nom varchar(35) not null,
    prenom varchar(40) not null,
    tel varchar(25) unique not null,
    mail varchar(45) unique not null,
    mot_de_passe varchar(35) not null,
    roles enum('admin', 'parent', 'specialiste', 'enseignant') not null
    );

CREATE TABLE enfants (
     id INT AUTO_INCREMENT PRIMARY KEY,
     nom VARCHAR(20) NOT NULL,
     prenom VARCHAR(20),
     age INT,
     sexe VARCHAR(15) CHECK (sexe IN ('homme', 'femme'))
     
);

CREATE TABLE admins (
     id INT AUTO_INCREMENT PRIMARY KEY,
);



CREATE TABLE question (
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

CREATE TABLE activites(
    id_activites INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50) NOT NULL,
    descriptions TEXT,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    type_activite ENUM("quiz","exercice","jeux") NOT NULL
);
CREATE TABLE IF NOT EXISTS quiz(
    id_quiz INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT FOREIGN KEY(id_quiz)REFERENCES activites(id_activites) ON DELETE CASCADE

);
CREATE TABLE evaluation(
    id_eveluation INT PRIMARY KEY AUTO_INCREMENT,
    type_ctivite VARCHAR(25) NOT NULL,
    score INT not null,
    scrore_global INT not null,
    date_evaluation DATE not null,
);

CREATE TABLE client(genre varchar(10));
CREATE TABLE specialiste(specialite varchar(20));

 CREATE TABLE Recommandation (
    id_recommandation INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandation DATE NOT NULL,
    type VARCHAR(100) NOT NULL
);