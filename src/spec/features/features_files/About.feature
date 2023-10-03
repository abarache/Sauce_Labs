Feature: Je spuhaite tester le bouton about
  En tant que utilsateur je souhaite m in former sur l application Swag Labs

  @about
  Scenario: Je souhaite tester le bouton about
    Given Je me connecte sur l application Swag Labs
    When Je clique sur le menu berger
    When Je clique sur le bouton about
    Then Je me redirige vers la page about
