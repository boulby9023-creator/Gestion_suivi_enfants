INSERT INTO recommendations (description,  date_recommandation, type) VALUES 
("Il lui faut des exercices courts et interactifs de 10 à 15 minutes 
afin d’améliorer sa concentration. Utiliser des jeux éducatifs de mémoire et 
de logique avec un système d’encouragement après chaque activité réussie."
, "2026-05-07", "Concentration et motivation") ;

INSERT INTO recommendations (description,  date_recommandation, id_capacite) VALUES 
("Proposez-lui des jeux de stratégie comme les échecs ou des casse-têtes pour muscler sa capacité de planification logique.", 
"2026-05-07",
1);

INSERT INTO recommandations (descriptions, date_recommandations, type_recommandations, id_evaluations) 
VALUES 
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



INSERT INTO recommendations (description, date_recommandation, id_capacite) VALUES 

('Proposez des jeux de mémoire, de logique et des casse-têtes afin de renforcer les capacités de raisonnement et d’analyse.','2026-05-07',1),

('Encouragez la lecture quotidienne et les exercices de compréhension pour améliorer les capacités intellectuelles et scolaires.','2026-05-07', 2),

('Favorisez les activités artistiques comme le dessin, la peinture ou la construction pour stimuler la créativité.','2026-05-07', 3),

('Mettre en place un environnement rassurant avec des échanges positifs afin de réduire le stress et améliorer la gestion des émotions.','2026-05-07', 4),

('Introduire des exercices de concentration et de relaxation pour améliorer l’attention et la stabilité mentale.','2026-05-07', 5),

('Encourager les activités physiques régulières et une alimentation équilibrée pour soutenir le développement corporel.','2026-05-07', 6);