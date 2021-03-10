Feature: Title of your feature
  I want to use this template for my feature file

 Scenario outline
    Given Enter <username> and <password>
    When If the Credentials are coorect login
    Then Close the application

    Examples: 
      | username  | password | 
      | name1 |     5 | 
      | name2 |     7 | 
