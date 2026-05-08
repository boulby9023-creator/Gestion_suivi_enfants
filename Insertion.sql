INSERT INTO recommendations (description,  date_recommandation, type) VALUES 
("Il lui faut des exercices courts et interactifs de 10 à 15 minutes 
afin d’améliorer sa concentration. Utiliser des jeux éducatifs de mémoire et 
de logique avec un système d’encouragement après chaque activité réussie."
, "2026-05-07", "Concentration et motivation") ;

INSERT INTO recommendations (descriptions,  date_recommandations, id_capacite) VALUES 
("Proposez-lui des jeux de stratégie comme les échecs ou des casse-têtes pour muscler sa capacité de planification logique.", 
"2026-05-07",
1);


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

