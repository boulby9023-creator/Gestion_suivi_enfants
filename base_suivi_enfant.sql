CREATE DATABASE Suivi_enfant;

CREATE TABLE Question (
    id_Q INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    pointure INT ,
    typeCapacite ENUM('Logique', 'Memoire', 'Attention'),
    delaiMax INT
);

CREATE TABLE Option (
    id_O INT PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(255) NOT NULL,
    estCorrect BOOLEAN,
    FOREIGN KEY (question_id) REFERENCES Question(id)
);