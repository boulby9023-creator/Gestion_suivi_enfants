CREATE DATABASE Suivi_enfant;

USE Suivi_enfant;

create table utilisateur(
    id int primary key auto_increment,
     nom varchar(35),
    prenom varchar(40),
    tel varchar(25),
    mail varchar(45),
    password varchar(35),
    role varchar(20)
    );