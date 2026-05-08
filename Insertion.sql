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
('Corporel'),
('Attention'),
('Motivation')
;


INSERT INTO recommandations( description, date_recommandations, type_recommandations, id_evaluations, id_capacite )
VALUES ( 'Mettre en place des exercices courts et dynamiques avec rappels fréquents.', '2026-05-07', 'Concentration', null, 7),
        ('Mettre en place un système de récompense afin de motiver l’enfant à terminer ses activités.','2026-05-07', null, 8),
        ('Encourager l’enfant à exprimer ses émotions à travers des activités artistiques.','2026-05-07', null, 4),
        ('Proposer des activités physiques régulières pour améliorer la santé mentale et physique de l’enfant.','2026-05-07', null, 5)
        ('Utiliser des jeux de rôle pour développer les compétences sociales et émotionnelles de l’enfant.','2026-05-07', null, 4)
        ('Introduire des exercices de respiration et de méditation pour aider à gérer le stress et l’anxiété.','2026-05-07', null, 5),
        ('Encourager la lecture quotidienne pour stimuler la créativité et l’imagination de l’enfant.','2026-05-07', null, 3),
        ('Proposer des activités de résolution de problèmes pour renforcer les capacités cognitives de l’enfant.','2026-05-07', null, 1),
        ('Mettre en place un environnement d’apprentissage structuré pour aider à améliorer la concentration de l’enfant.','2026-05-07', null, 7)
;