CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;

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
    id_enfants INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    date_naissance DATE,
    sexe ENUM ('garçon', 'fille') NOT NULL,
    id_activites INT,
    id_parent INT,
    FOREIGN KEY(id_parent) REFERENCES parents(id_parent) ON DELETE CASCADE,
    FOREIGN KEY(id_activites) REFERENCES activites(id_activites) ON DELETE SET NULL
);

-- 5. Table Corporelles (Une seule fois suffit !)
CREATE TABLE corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT NOT NULL,
    poids FLOAT NOT NULL,
    taille FLOAT NOT NULL,
    imc FLOAT NOT NULL,
    date_enregistrement DATE NOT NULL,
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfants) ON DELETE CASCADE
);

-- 6. Tables pour les Questions et Quiz
CREATE TABLE questions (
    id_questions INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    type_capacite ENUM('Logique', 'Memoire', 'Attention'),
    delai_max INT
);

CREATE TABLE options (
    id_options INT PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(255) NOT NULL,
    est_correct BOOLEAN,
    id_question INT,
    FOREIGN KEY(id_question) REFERENCES questions(id_questions) ON DELETE CASCADE
);

CREATE TABLE quiz (
    id_quiz INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT fk_quiz_act FOREIGN KEY(id_quiz) REFERENCES activites(id_activites) ON DELETE CASCADE
);

CREATE TABLE question_quiz (
    id_questions INT,
    id_quiz INT,
    PRIMARY KEY(id_questions, id_quiz),
    FOREIGN KEY (id_questions) REFERENCES questions(id_questions) ON DELETE CASCADE,
    FOREIGN KEY (id_quiz) REFERENCES quiz(id_quiz) ON DELETE CASCADE
);

-- 7. Évaluations et Recommandations
CREATE TABLE evaluations (
    id_evaluation INT PRIMARY KEY AUTO_INCREMENT,
    type_activite VARCHAR(25) NOT NULL,
    score INT NOT NULL,
    score_global INT NOT NULL,
    date_evaluations DATE NOT NULL
);

CREATE TABLE recommandations (
    id_recommandations INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandations DATE NOT NULL,
    type_recommandations VARCHAR(100) NOT NULL,
    id_evaluations INT,
    FOREIGN KEY (id_evaluations) REFERENCES evaluations(id_evaluation) ON DELETE CASCADE
);