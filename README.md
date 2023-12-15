# Mind Masters

## Description
Notre application est une plateforme de gestion d'une université basée sur une architecture distribuée, composée de six microservices distincts pour la gestion des universités, des foyers, des blocs, des chambres, des équipements et des restaurants.

## Microservices

1. **Microservice Université**
    - Ajout, modification et suppression d'informations universitaires.

2. **Microservice Foyer**
    - Gestion des foyers, y compris l'ajout, la modification et la suppression.

3. **Microservice Bloc**
    - Gestion des blocs de logement, y compris l'ajout, la modification et la suppression.

4. **Microservice Chambre**
    - Gestion des chambres d'étudiants, y compris l'ajout, la modification et la suppression.

5. **Microservice Équipement**
    - Gestion des équipements disponibles dans l'université.

6. **Microservice Restaurant**
    - Gestion des restaurants universitaires, y compris l'ajout, la modification et la suppression.

## Technologies Utilisées
- Java (Spring Boot) pour le développement des microservices.
- Docker pour la conteneurisation des services.
- Docker Compose pour l'orchestration des conteneurs.

## Déploiement

### Prérequis
- Docker installé localement.

### Instructions de Déploiement
1. Clonez ce dépôt sur votre machine locale.
2. Accédez à chaque microservice et exécutez `docker build -t nom_du_microservice .` pour construire l'image Docker.
3. À la racine du projet, exécutez `docker-compose up` pour démarrer tous les microservices.

## Configuration

Chaque microservice a ses propres fichiers de configuration, notamment les fichiers `application.properties`. Assurez-vous de configurer correctement ces fichiers en fonction de vos besoins.

## API Endpoints

Consultez la documentation de chaque microservice pour connaître les points d'accès disponibles et les actions possibles.

## Contribuer

Pour contribuer à ce projet, veuillez suivre les étapes standard de contribution, telles que la création d'une nouvelle branche, la réalisation des modifications et la création d'une demande de tirage.

## Auteur
Equipe Mind Masters 

