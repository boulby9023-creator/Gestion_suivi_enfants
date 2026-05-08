
INSERT INTO recommandations (id_enfant, description, categorie, priorite)
VALUES
(1, 'Encourager des jeux de mémoire visuelle (memoire) 15 min par jour.', 'Cognitif', 'Haute'),
(1, 'Pratiquer la lecture à voix haute pour améliorer la compréhension.', 'Intellectuel', 'Moyenne'),
(2, 'Proposer des activités de dessin pour stimuler la gestion des émotions.', 'Émotionnel', 'Basse'),
(3, "Augmenter l\'apport en calcium suite à la dernière courbe de croissance.", 'Corporel', 'Haute');

INSERT INTO recommandation(type, description, date) VALUES
('Attention', 'Faire des exercices de concentration pendant 15 minutes par jour', '2026-05-07'),
('Logique', 'Encourager la lecture d’histoires adaptées à son âge', '2026-05-07'),
('Memoire', 'Féliciter l’enfant après chaque activité réussie', '2026-05-07'),
('Mémoire', 'Utiliser des jeux de mémoire visuelle deux fois par semaine', '2026-05-07'),
('Attention', 'Favoriser les activités de groupe avec d’autres enfants', '2026-05-07');

INSERT INTO Capacites (type_capacite) VALUES
('Cognitif'),
('Intellectuel'),
('Créativité'),
('Émotionnel'),
('Mental'),
('Corporel');