INSERT INTO recommandations (descriptions, date_recommandations, type_recommandations, id_evaluations) 
VALUES 
('Encourager des jeux de mémoire visuelle (mémoire) 15 min par jour.', '2026-05-08', 'Memoire', 1),
('Pratiquer la lecture à voix haute pour améliorer la concentration.', '2026-05-08', 'Attention', 1),
('Utiliser des puzzles pour stimuler le raisonnement.', '2026-05-08', 'Logique', 2),
('Exercices de mémorisation des chiffres après chaque séance.', '2026-05-08', 'Memoire', 3);

INSERT INTO recommendations (description,  date_recommandation, type) VALUES 
("Il lui faut des exercices courts et interactifs de 10 à 15 minutes 
afin d’améliorer sa concentration. Utiliser des jeux éducatifs de mémoire et 
de logique avec un système d’encouragement après chaque activité réussie."
, "2026-05-07", "Concentration et motivation") ;


INSERT INTO recommandations (id_enfant, description, categorie, priorite) 
VALUES 
(6, 'Mettre en place des exercices de lecture syllabique avec support visuel pendant 15 minutes par jour.', 'Intellectuel', 'Haute'),

(7, 'Pratiquer des activités de différenciation gauche/droite à travers des jeux interactifs et des consignes simples.', 'Cognitif', 'Haute'),

(8, 'Encourager les activités de dessin, puzzles et logique visuelle afin de renforcer la confiance et les capacités de repérage.', 'Cognitif', 'Moyenne'),

(9, 'Créer un environnement rassurant pour les exercices oraux afin de réduire l’anxiété scolaire et favoriser l’expression en classe.', 'Émotionnel', 'Haute');
INSERT INTO Capacites (type_capacite) VALUES 
('Cognitif'),
('Intellectuel'),
('Créativité'),
('Émotionnel'),
('Mental'),
('Corporel');
