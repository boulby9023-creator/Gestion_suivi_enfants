INSERT INTO recommandations (descriptions, date_recommandations, type_recommandations, id_evaluations) 
VALUES 

(1, 'Encourager des jeux de mémoire visuelle (memoire) 15 min par jour.', 'Cognitif', 'Haute'),
(1, 'Pratiquer la lecture à voix haute pour améliorer la compréhension.', 'Intellectuel', 'Moyenne'),
(2, 'Proposer des activités de dessin pour stimuler la gestion des émotions.', 'Émotionnel', 'Basse'),
(3, 'Augmenter l\'apport en calcium suite à la dernière courbe de croissance.', 'Corporel', 'Haute');



INSERT INTO recommandations (id_enfant, description, categorie, priorite) 
VALUES 
(1, 'Améliorer la mémoire en utilisant des jeux de répétition de séquences (mots ou images) 10 à 15 minutes par jour.', 'Cognitif', 'Haute'),
(2, 'Renforcer la confiance en soi en valorisant les réussites de l’enfant au quotidien.', 'Émotionnel', 'Haute'),
(3, 'Surveiller la croissance et encourager une alimentation riche en protéines et vitamines.', 'Corporel', 'Haute'),


('Encourager des jeux de mémoire visuelle (mémoire) 15 min par jour.', '2026-05-08', 'Memoire', 1),
('Pratiquer la lecture à voix haute pour améliorer la concentration.', '2026-05-08', 'Attention', 1),
('Utiliser des puzzles pour stimuler le raisonnement.', '2026-05-08', 'Logique', 2),
('Exercices de mémorisation des chiffres après chaque séance.', '2026-05-08', 'Memoire', 3);

INSERT INTO Capacites (type_capacite) VALUES 
('Cognitif'),
('Intellectuel'),
('Créativité'),
('Émotionnel'),
('Mental'),
('Corporel');

