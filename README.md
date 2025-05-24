# Rapport de TP – Gestion des Patients (Partie 2)

## Introduction

Dans ce TP, j’ai développé une application web simple pour gérer une liste de patients.  
L’objectif principal était de créer une interface utilisateur permettant d’afficher, rechercher et supprimer des patients dans une base de données, tout en appliquant la pagination pour gérer l’affichage des résultats.

---

## Ce que j’ai réalisé

### 1. Entité Patient

J’ai défini une entité `Patient` avec les attributs suivants : nom, prénom, date de naissance, un indicateur pour savoir si le patient est malade, et un score.  
Cette entité est liée à une table dans la base de données.

### 2. Repository pour la gestion des données

J’ai utilisé un repository Spring Data JPA pour interagir avec la base de données, ce qui facilite les opérations CRUD (Créer, Lire, Mettre à jour, Supprimer).  
J’ai ajouté une méthode personnalisée permettant la recherche des patients par nom ou prénom, insensible à la casse.

### 3. Contrôleur Web

Le contrôleur Spring MVC gère les requêtes HTTP :  
- Affichage paginé de la liste des patients  
- Recherche par mot-clé  
- Suppression d’un patient avec confirmation  

Il prépare les données à afficher dans la vue Thymeleaf.

### 4. Initialisation des données

Pour faciliter les tests, j’ai ajouté un jeu de données initiales qui s’insèrent automatiquement à chaque démarrage de l’application.

### 5. Vue Thymeleaf

J’ai conçu une page web dynamique utilisant Thymeleaf, affichant :  
- La liste des patients  
- Un formulaire de recherche  
- Les boutons de suppression avec confirmation  
- La pagination pour naviguer entre les pages

---

## Configuration et environnement

- Base de données MySQL locale via XAMPP  
- Configuration dans `application.properties` avec les informations de connexion  
- Serveur Spring Boot lancé sur le port 8686  

---

## Résultats

- La liste des patients s’affiche correctement avec leurs détails  
- La recherche filtre efficacement les patients  
- La pagination permet de naviguer facilement dans les pages  
- La suppression fonctionne avec confirmation

---

## Illustrations

### Base de données dans phpMyAdmin (XAMPP)

![Résultat console](screenshots/db.PNG)

![Résultat console](screenshots/résultat.PNG)


---

## Conclusion

Ce TP m’a permis de consolider mes compétences en :  
- Gestion des entités et repositories avec JPA  
- Création de contrôleurs Spring MVC  
- Développement de vues dynamiques avec Thymeleaf  
- Mise en place de la pagination et de la recherche  

La prochaine étape sera d’ajouter la validation des formulaires pour assurer la qualité des données saisies.

---

