package org.egg.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import org.egg.pages.SDLoginPage;

public class SDTests {

    // Intancia el Page Object
    private SDLoginPage page = new SDLoginPage(InitTests.getDriver());

    //Definiciones de pasos de las pruebas: Given | When | Then | And | But

    @Given("Estoy en la página de login de SauceDemo {string}")
    public void Estoy_en_la_pagina_de_login_de_SauceDemo(String url) {
        page.navegoALoginPage(url);
    }

    @When("Intento iniciar sesión sin ingresar ni usuario ni clave")
    public void Intento_iniciar_sesion_sin_ingresar_ni_usuario_ni_clave() {
        page.ingresoVacio();
    }

    @Then("Veo un mensaje de error: {string}")
    public void Veo_un_mensaje_de_error_de_login(String error) {
        assertEquals(error, page.obtenerErrorLogin());
    }

    @When("Intento iniciar sesión con {string} correcto y {string} incorrecta")
    public void Intento_iniciar_sesión_con_usuario_correcto_y_clave_incorrecta(String usuario, String clave){
        page.ingresoUsuarioCorrectoClaveIncorrecta(usuario, clave);
    }

}
