# gestion-des-produits-pharmaceutique

  src/
        main/
            java/
                 com/
                     pharmacie/
                         gestionproduits/
                             controller/
                                 ProductController.java
                             model/
                                 Product.java
                            repository/
                                 ProductRepository.java
                            service/
                                 ProductService.java
                             GestionProduitsApplication.java
             resources/
                 application.properties
                 static/
                 templates/
     test/
         java/
            com/
                pharmacie/
                     gestionproduits/
                         GestionProduitsApplicationTests.java


# Gestion des Produits Pharmaceutiques

Cette application Spring Boot permet de gérer les produits d'une pharmacie.  
Fonctionnalités principales :
- Ajouter, modifier, supprimer un produit
- Afficher la liste des produits
- Rechercher des produits par catégorie, nom ou prix

## Technologies utilisées

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven 