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

