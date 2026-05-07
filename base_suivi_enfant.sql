CREATE DATABASE Suivi_enfant;
 CREATE TABLE Recommandation (
    id_re INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    date_recommandation DATE NOT NULL,
    type VARCHAR(100) NOT NULL
);