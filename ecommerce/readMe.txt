1) Users
Personnes pouvant utiliser l'application.

Deux types de User sont prévus:
    - Les responsables (Directeur, responsable de rayon, responsable de dépôt, responsable de caisse)
    - Les employés (vendeurs(ses), hôtes(ses) de caisse, agent de merchandising)

Il conviendra de prévoir un stockage en base pour chaque responsable/employé, et pour chaque User on gardera:

    - 1) Un username : Concaténation nom + prénom (règle à définir), utile uniquement dans le cas de l'authentification et de l'autorisation du user
    - 2) Son prénom
    - 3) Son nom
    - 4) Son mot de passe encodé via le protocole BCrypt
    - 5) Son rôle (user ou admin)
    - 6) l'intitulé de son poste
    - 7) Son profil de démarrage de l'application

Lors de l'authentification du user, selon son rôle, les différentes parties de l'IHM ne seront pas accessibles.
Par exemple:
    - Un admin avec poste directeur aura accès à toutes les parties
    - Un vendeur aura accès aux parties en rapport avec la vente uniquement


