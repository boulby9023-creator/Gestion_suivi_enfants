CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;
create table corporelle (
    id INT PRIMARY KEY AUTO_INCREMENT,
    poids float,
    taille float,
    imc float,
    date DATE
    );

create table utilisateur(
    id int primary key auto_increment,
     nom varchar(35),
    prenom varchar(40),
    tel varchar(25),
    mail varchar(45),
    password varchar(35),
    role varchar(20)
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



CREATE TABLE Question (
    id_Q INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    typeCapacite ENUM('Logique', 'Memoire', 'Attention'),
    delaiMax INT
);

CREATE TABLE Options (
    id_O INT PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(255) NOT NULL,
    estCorrect BOOLEAN,
    FOREIGN KEY (question_id) REFERENCES Question(id)
)

CREATE TABLE activites(
    id_activites INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50) NOT NULL,
    descriptions TEXT,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    type_activite ENUM("quiz","exercice","jeux") NOT NULL
);
CREATE TABLE IF NOT EXISTS quiz(
    id_activites INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT FOREIGN KEY(id_activites)REFERENCES activites(id_activites) ON DELETE CASCADE

);
CREATE TABLE evaluation(
    id_pr INT PRIMARY KEY AUTO_INCREMENT,
    typeActivite VARCHAR(25) NOT NULL,
    score INT,
    scroreGlobal INT,
    date_evaluation DATE,
);

CREATE TABLE client(genre varchar(10));
CREATE TABLE specialiste(specialite varchar(20));

 CREATE TABLE Recommandation (
    id_re INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandation DATE NOT NULL,
    type VARCHAR(100) NOT NULL
)