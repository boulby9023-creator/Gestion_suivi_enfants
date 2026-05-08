
INSERT INTO recommandations (id_enfant, description, categorie, priorite)
VALUES
(1, 'Encourager des jeux de mémoire visuelle (memoire) 15 min par jour.', 'Cognitif', 'Haute'),
(1, 'Pratiquer la lecture à voix haute pour améliorer la compréhension.', 'Intellectuel', 'Moyenne'),
(2, 'Proposer des activités de dessin pour stimuler la gestion des émotions.', 'Émotionnel', 'Basse'),
(3, "Augmenter l\'apport en calcium suite à la dernière courbe de croissance.", 'Corporel', 'Haute');

INSERT INTO recommandation(descriptions, date_recommandations,  id_capacite) VALUES
( 'Faire des exercices de concentration pendant 15 minutes par jour', '2026-05-07',2),
( 'Encourager la lecture d’histoires adaptées à son âge', '2026-05-07',3),
( 'Féliciter l’enfant après chaque activité réussie', '2026-05-07', 5),
( 'Utiliser des jeux de mémoire visuelle deux fois par semaine', '2026-05-07',5),
( 'Favoriser les activités de groupe avec d’autres enfants', '2026-05-07',2);

INSERT INTO Capacites (type_capacite) VALUES 
('Cognitif'),
('Intellectuel'),
('Créativité'),
('Émotionnel'),
('Mental'),
('Corporel'),
('Attention'),
('Motivation')
;


INSERT INTO recommandations( description, date_recommandations,  id_capacite )
VALUES ( 'Mettre en place des exercices courts et dynamiques avec rappels fréquents.', '2026-05-07', 7),
        ('Mettre en place un système de récompense afin de motiver l’enfant à terminer ses activités.','2026-05-07', 8),
        ('Encourager l’enfant à exprimer ses émotions à travers des activités artistiques.','2026-05-07', 4),
        ('Proposer des activités physiques régulières pour améliorer la santé mentale et physique de l’enfant.','2026-05-07', 5)
        ('Utiliser des jeux de rôle pour développer les compétences sociales et émotionnelles de l’enfant.','2026-05-07', 4)
        ('Introduire des exercices de respiration et de méditation pour aider à gérer le stress et l’anxiété.','2026-05-07', 5),
        ('Encourager la lecture quotidienne pour stimuler la créativité et l’imagination de l’enfant.','2026-05-07', 3),
        ('Proposer des activités de résolution de problèmes pour renforcer les capacités cognitives de l’enfant.','2026-05-07', 1),
        ('Mettre en place un environnement d’apprentissage structuré pour aider à améliorer la concentration de l’enfant.','2026-05-07',  7)
;

