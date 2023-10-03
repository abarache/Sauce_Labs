Feature: Je souhaite tester le page de connexion de l application Swag Labs avec plusieurs comptes
  En tant que utilisateur je souhaite tester la page connexion de l application

  @login_outline
  Scenario Outline: Je souhaite me connecter avec plusieurs comptes
    Given Je me connecte sur l application Swag Labs
    When Je saisie le username "<username>"
    When je saisie le pasword "<password>"
    When Je clique sur le bouton login
    Then Je me redirige à la pageHome "Products"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
