CREATE DATABASE IF NOT EXISTS Suivi_enfant;
USE Suivi_enfant;

-- ==========================================================
-- 1. TABLES DE RÉFÉRENCE (Indépendantes)
-- ==========================================================

-- Doit être créée en premier car elle est référencée partout
CREATE TABLE Capacites (
    id_capacite INT PRIMARY KEY AUTO_INCREMENT,
    type_capacite VARCHAR(100) NOT NULL
);

CREATE TABLE utilisateurs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(35) NOT NULL,
    prenom VARCHAR(40) NOT NULL,
    tel VARCHAR(25) UNIQUE NOT NULL,
    mail VARCHAR(45) UNIQUE NOT NULL,
    mot_de_passe VARCHAR(255) NOT NULL,
    roles ENUM('admin', 'parent', 'specialiste', 'enseignant') NOT NULL
);

-- ==========================================================
-- 2. SPÉCIALISATIONS DES UTILISATEURS
-- ==========================================================

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

-- ==========================================================
-- 3. ACTIVITÉS ET ENFANTS
-- ==========================================================

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

-- ==========================================================
-- 4. SUIVI ET EXERCICES (QUIZ / QUESTIONS)
-- ==========================================================

CREATE TABLE corporelles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_enfant INT NOT NULL,
    poids FLOAT NOT NULL,
    taille FLOAT NOT NULL,
    imc FLOAT NOT NULL,
    date_enregistrement DATE NOT NULL,
    FOREIGN KEY (id_enfant) REFERENCES enfants(id_enfants) ON DELETE CASCADE
);

CREATE TABLE quiz (
    id_quiz INT PRIMARY KEY AUTO_INCREMENT,
    temps_limite INT,
    score_max INT,
    CONSTRAINT fk_quiz_act FOREIGN KEY(id_quiz) REFERENCES activites(id_activites) ON DELETE CASCADE
);

CREATE TABLE questions (
    id_questions INT PRIMARY KEY AUTO_INCREMENT,
    enonce VARCHAR(255) NOT NULL,
    delai_max INT,
    id_capacite INT,
    FOREIGN KEY(id_capacite) REFERENCES Capacites(id_capacite) ON DELETE SET NULL
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

-- ==========================================================
-- 5. ÉVALUATIONS ET RÉSULTATS
-- ==========================================================

CREATE TABLE evaluations (
    id_evaluation INT PRIMARY KEY AUTO_INCREMENT,
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
    descriptions TEXT NOT NULL,
    date_recommandations DATE NOT NULL,
    id_evaluations INT,
    id_capacite INT,
    FOREIGN KEY (id_evaluations) REFERENCES evalsrc src/main src/main/java src/main/java/BD src/main/java/BD/Connexion.java src/main/java/BD/ConnexionDB.java src/main/java/DAO src/main/java/DAO/ImplAdmin.java src/main/java/DAO/ImplAdminDao.java src/main/java/DAO/ImplcorporelleDao.java src/main/java/DAO/ImplEnfantDAO.java src/main/java/DAO/ImplEvaluationDao.java src/main/java/DAO/ImplOptionDao.java src/main/java/DAO/ImplParentDAO.java src/main/java/DAO/ImplQuestionDAO.java src/main/java/DAO/ImplRecommandationDao.java src/main/java/DAO/ImplUtilisateurDao.java src/main/java/DAO/Repository.java src/main/java/enumeration src/main/java/enumeration/CapaciteEnum.java src/main/java/enumeration/RoleEnum.java src/main/java/enumeration/TypeCapacitesEnum.java src/main/java/enumeration/TypeExercice.java src/main/java/enumeration/TypeJeu.java src/main/java/Modele src/main/java/Modele/Activite.java src/main/java/Modele/Admins.java src/main/java/Modele/Capacites.java src/main/java/Modele/Corporelle.java src/main/java/Modele/Enfant.java src/main/java/Modele/EnfantActivite.java src/main/java/Modele/Enseigant.java src/main/java/Modele/Enseignant.java src/main/java/Modele/Evaluation.java src/main/java/Modele/Option.java src/main/java/Modele/Parent.java src/main/java/Modele/Question.java src/main/java/Modele/Questionquiz.java src/main/java/Modele/Quiz.java src/main/java/Modele/Recommandation.java src/main/java/Modele/ReponseEnfant.java src/main/java/Modele/Specialiste.java src/main/java/Modele/Test.java src/main/java/Modele/Utilisateur.java src/main/java/Service src/main/java/Service/interfaces src/main/java/Service/interfaces/ConnexionInService.java src/main/java/Service/interfaces/EnfantService.java src/main/java/Service/interfaces/ProfileEnfant.java src/main/java/Service/interfaces/QuizService.java src/main/java/Service/interfaces/UtilisateurInService.java src/main/java/Service/ConnexionService.java src/main/java/Service/EnfantImplService.java src/main/java/Service/ListeEnfants.java src/main/java/Service/MenuParent.java src/main/java/Service/OptionQuestion.java src/main/java/Service/OptionQuiz.java src/main/java/Service/ProfileimplEnfant.java src/main/java/Service/QuizImplService.java src/main/java/Service/UtilisateurImplService.java src/main/java/variableGlobeaux src/main/java/variableGlobeaux/Variable.java src/main/java/variableGlobeaux/VariableIdEnfant.java src/main/java/Authentification.java src/main/java/main.java src/main/java/MainApp.javauations(id_evaluation) ON DELETE CASCADE,
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

ALTER TABLE activites ADD type_activites ENUM("Cognitif", "Intellectuel") NOT NULL;