Feature: Automatización del Login de SauceDemo

Background: 
    Given Estoy en la página de login de SauceDemo "https://www.saucedemo.com/v1/index.html"

@login
Scenario: Intentar iniciar sesión sin las credenciales
    When Intento iniciar sesión sin ingresar ni usuario ni clave
    Then Veo un mensaje de error: "Epic sadface: Username is required"

@login
Scenario Outline: Intentar iniciar sesión con usuario correcto y clave incorrecta
    When Intento iniciar sesión con "<usuario>" correcto y "<clave>" incorrecta
    Then Veo un mensaje de error: "Epic sadface: Username and password do not match any user in this service"

    Examples:
    |usuario                |clave     |
    |standard_user          |incorrecta|
    |locked_out_user        |incorrecta|
    |problem_user           |incorrecta|
    |performance_glitch_user|incorrecta|

@login
Scenario Outline: Intentar iniciar sesión con usuario correcto y clave correcta
    When Intento iniciar sesión con "<usuario>" correcto y "<clave>" correcta
    Then Veo un título en la página que dice "Products"

    Examples:
    |usuario                |clave       |
    |standard_user          |secret_sauce|
    |locked_out_user        |secret_sauce|
    |problem_user           |secret_sauce|
    |performance_glitch_user|secret_sauce|ø