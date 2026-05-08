CREATE DATABASE Suivi_enfant;
USE Suivi_enfant;

<<<<<<< HEAD
-- 1. Table Utilisateurs (Base pour les rôles)
=======
-- ==========================================================
-- 1. TABLES DE RÉFÉRENCE (Indépendantes)
-- ==========================================================

-- Doit être créée en premier car elle est référencée partout
CREATE TABLE Capacites (
    id_capacite INT PRIMARY KEY AUTO_INCREMENT,
    type_capacite VARCHAR(100) NOT NULL
);

>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
CREATE TABLE utilisateurs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(35) NOT NULL,
    prenom VARCHAR(40) NOT NULL,
    tel VARCHAR(25) UNIQUE NOT NULL,
    mail VARCHAR(45) UNIQUE NOT NULL,
    mot_de_passe VARCHAR(255) NOT NULL, -- Augmenté pour le hachage
    roles ENUM('admin', 'parent', 'specialiste', 'enseignant') NOT NULL
);

<<<<<<< HEAD
-- 2. Tables de spécialisation des utilisateurs
=======
-- ==========================================================
-- 2. SPÉCIALISATIONS DES UTILISATEURS
-- ==========================================================

>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
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

<<<<<<< HEAD
-- 3. Table Activités (Nécessaire pour la table Enfants)
=======
-- ==========================================================
-- 3. ACTIVITÉS ET ENFANTS
-- ==========================================================

>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
CREATE TABLE activites (
    id_activites INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50) NOT NULL,
    descriptions TEXT,
    age_min INT,
    age_max INT,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    id_capacite INT,
    FOREIGN KEY(id_capacite) REFERENCES Capacites(id_capacite) ON DELETE SET NULL
);

<<<<<<< HEAD
-- 4. Table Enfants
=======
>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
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

<<<<<<< HEAD
-- 5. Table Corporelles (Une seule fois suffit !)
=======
-- ==========================================================
-- 4. SUIVI ET EXERCICES (QUIZ / QUESTIONS)
-- ==========================================================

>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
CREATE TABLE corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT NOT NULL,
    poids FLOAT NOT NULL,
    taille FLOAT NOT NULL,
    imc FLOAT NOT NULL,
    date_enregistrement DATE NOT NULL,
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfants) ON DELETE CASCADE
);

<<<<<<< HEAD
-- 6. Tables pour les Questions et Quiz
=======
CREATE TABLE quiz (
    id_quiz INT PRIMARY KEY,
    temps_limite INT,
    score_max INT,
    CONSTRAINT fk_quiz_act FOREIGN KEY(id_quiz) REFERENCES activites(id_activites) ON DELETE CASCADE
);

>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
CREATE TABLE questions (
    id_questions INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    delai_max INT,
    id_capacite INT,
    FOREIGN KEY(id_capacite) REFERENCES Capacites(id_capacite) ON DELETE SET NULL
);

CREATE TABLE options (
    id_option INT PRIMARY KEY AUTO_INCREMENT,
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

-- ==========================================================
-- 5. ÉVALUATIONS ET RÉSULTATS
-- ==========================================================

CREATE TABLE evaluations (
    id_evaluation INT PRIMARY KEY AUTO_INCREMENT,
    score INT NOT NULL,
    score_global INT NOT NULL,
    date_evaluations DATE NOT NULL
);

CREATE TABLE recommandations (
    id_recommandations INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandations DATE NOT NULL,
<<<<<<< HEAD
    type_recommandations VARCHAR(100) NOT NULL,
=======
>>>>>>> 8abe6c2d1fc3f19540a30a9482ce465ab04cc4ad
    id_evaluations INT,
    id_capacite INT,
    FOREIGN KEY (id_evaluations) REFERENCES evaluations(id_evaluation) ON DELETE CASCADE,
    FOREIGN KEY(id_capacite) REFERENCES Capacites(id_capacite) ON DELETE SET NULL
);

-- ==========================================================
-- 6. TABLES DE LIAISON ET RÉPONSES
-- ==========================================================

CREATE TABLE enfants_activites (
    id_enfants INT,
    id_activites INT,
    date_participation DATE,
    PRIMARY KEY(id_enfants, id_activites),
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE,
    FOREIGN KEY (id_activites) REFERENCES activites(id_activites) ON DELETE CASCADE
);

CREATE TABLE reponses_enfants (
    id_reponse INT PRIMARY KEY AUTO_INCREMENT,
    id_enfants INT,
    id_questions INT,
    id_options INT,
    date_reponse DATE,
    FOREIGN KEY (id_enfants) REFERENCES enfants(id_enfants) ON DELETE CASCADE,
    FOREIGN KEY (id_questions) REFERENCES questions(id_questions) ON DELETE CASCADE,
    FOREIGN KEY (id_options) REFERENCES options(id_options) ON DELETE CASCADE
);