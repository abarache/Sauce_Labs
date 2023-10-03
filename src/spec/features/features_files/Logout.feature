Feature: Je souhaite tester le page de deconnexion de l application Swag Labs
  En tant que utilisateur je souhaite tester la page de la deconnexion de l application

  @logout
  Scenario: Je souhaite tester la deconnexion de l application Swag Labs
    Given Je rentre dans l application Swag Labs
    When Je clique sur le menu berger
    When Je clique sur le boton logout
    Then Je me redirige vers la page connexion "https://www.saucedemo.com/"
