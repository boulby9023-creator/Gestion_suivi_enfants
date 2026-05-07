CREATE DATABASE Suivi_enfant

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
