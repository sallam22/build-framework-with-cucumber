Feature: Login Feature
  

  Scenario Outline: User login with valid email and valid password
    Given User open site and go to login page
    When User enters "<Username>" and "<Password>"
    Then User should login successfully
    Examples:
    |  Username  |     Password   |
    
    |  sallamfcisdd@gmail.com  |     sallamhyf  |
    
    |  sallamfcis@gmail.com  |    sallam123  |
    