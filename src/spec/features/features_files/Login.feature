Feature: Je souhaite tester le page de connexion de l application Swag Labs
  En tant que utilisateur je souhaite tester la page de la connexion de l application

  @login_casPassant
  Scenario: Je souhaite tester la page de connexion avec un cas passant
    Given Je me connecte a l application Swag Labs
    Then Je me redirige vers la page home "Products"

  @login_casNonPassant
  Scenario: Je souhaite tester la page de connexion avec un cas non passant
    Given Je me connecte a l application Swag Labs avec coordonnees non correct
    Then le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
