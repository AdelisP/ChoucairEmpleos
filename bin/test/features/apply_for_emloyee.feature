@Jobs
Feature: Apply for employ
  I as user, i want to apply for a employ.

  Background: Start the web browser
    Given The user starts the navigator

  @case1
  Scenario: Select and apply for a job
    Given The user search a job with the keyword "pruebas" in the location "bogota"
    When he select a job offer and fill the form
      | Name                   | Email          | Phone     | Formal studies             | Testing experience              | Knowledge in automation            | Wage aspiration | Time aviability | Aditional message  |
      | Diego Emilio Rodriguez | emilo_test.com | 321567899 | Tengo estudios formales... | Si conozco las pruebas manuales | Si conozco algo de automatizacion. | $4300000        | 1 semana        | esto es una prueba |
    Then he verify the entered data in email input and see the message "La dirección de correo electrónico introducida no es válida."

