CREATE DATABASE IF NOT EXISTS Suivi_enfant;
USE Suivi_enfant;

-- 1. Table Utilisateurs
CREATE TABLE utilisateurs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(35) NOT NULL,
    prenom VARCHAR(40) NOT NULL,
    tel VARCHAR(25) UNIQUE NOT NULL,
    mail VARCHAR(45) UNIQUE NOT NULL,
    mot_de_passe VARCHAR(255) NOT NULL,
    roles ENUM('admin', 'parent', 'specialiste', 'enseignant') NOT NULL
);

-- 2. Spécialisations
CREATE TABLE parents (
    id_parent INT PRIMARY KEY, 
    genre VARCHAR(10), 
    CONSTRAINT fk_parent_user FOREIGN KEY(id_parent) REFERENCES utilisateurs(id) ON DELETE CASCADE
);

CREATE TABLE specialistes (
    id_specialiste INT PRIMARY KEY, 
    specialite VARCHAR(50), 
    CONSTRAINT fk_spec_user FOREIGN KEY(id_specialiste) REFERENCES utilisateurs(id) ON DELETE CASCADE
);

CREATE TABLE admins (
     id_admins INT PRIMARY KEY, 
     CONSTRAINT fk_admin_user FOREIGN KEY (id_admins) REFERENCES utilisateurs(id) ON DELETE CASCADE
);

-- 3. Activités (doit être créée avant 'enfants')
CREATE TABLE activites (
    id_activites INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50) NOT NULL,
    descriptions TEXT,
    age_min INT,
    age_max INT,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    type_activite ENUM('quiz', 'exercice', 'jeux') NOT NULL
);

-- 4. Enfants
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

-- 5. Suivi Corporel
CREATE TABLE corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT NOT NULL,
    poids FLOAT NOT NULL,
    taille FLOAT NOT NULL,
    imc FLOAT NOT NULL,
    date_enregistrement DATE NOT NULL,
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfants) ON DELETE CASCADE
);

-- 6. Quiz et Questions
CREATE TABLE quiz (
    id_quiz INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT fk_quiz_act FOREIGN KEY(id_quiz) REFERENCES activites(id_activites) ON DELETE CASCADE
);

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
    date_evaluations DATE NOT NULL,
    id_enfants INT,
    id_activites INT,
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE,
    FOREIGN KEY (id_activites) REFERENCES activites(id_activites) ON DELETE CASCADE
);

CREATE TABLE recommandations (
    id_recommandations INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandations DATE NOT NULL,
    type_recommandations VARCHAR(100) NOT NULL,
    id_evaluations INT,
    FOREIGN KEY (id_evaluations) REFERENCES evaluations(id_evaluation) ON DELETE CASCADE
);

-- 8. Tables de liaison (Relations Many-to-Many)
CREATE TABLE enfants_activites (
    id_enfants INT,
    id_activites INT,
    date_participation DATE,
    PRIMARY KEY(id_enfants, id_activites),
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE,
    FOREIGN KEY (id_activites) REFERENCES activites(id_activites) ON DELETE CASCADE
);

CREATE TABLE reponses_enfants (
    id_reponse int primary key,
    id_enfants INT,
    id_questions INT,
    id_options INT,
    date_reponse DATE,
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE,
    FOREIGN KEY (id_questions) REFERENCES questions(id_questions) ON DELETE CASCADE,
    FOREIGN KEY (id_options) REFERENCES options(id_options) ON DELETE CASCADE
);