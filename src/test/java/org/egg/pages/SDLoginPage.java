package org.egg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SDLoginPage extends InitPage{

    // Selectores
    public static final String BOTON_LOGIN = "input#login-button";
    public static final String CAJA_USUARIO = "input#user-name";
    public static final String CAJA_CLAVE = "input#password";
    public static final String ERROR_LOGIN = "h3[data-test=\"error\"]";

    // Inicialización por PageFactory

    @FindBy (css=BOTON_LOGIN)
    WebElement botonLogin;

    @FindBy (css=ERROR_LOGIN)
    WebElement errorLogin;

    @FindBy (css=CAJA_USUARIO)
    WebElement cajaUsuario;

    @FindBy (css=CAJA_CLAVE)
    WebElement cajaClave;

    // Constructor
    public SDLoginPage(WebDriver driver) { 
        super(driver);
    }

    // Métodos
    public void navegoALoginPage(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void ingresoVacio() {
        botonLogin.click();
    }

    public String obtenerErrorLogin() {
        return errorLogin.getText();
    }

    public void ingresoUsuarioCorrectoClaveIncorrecta(String usuario, String clave) {
        cajaUsuario.sendKeys(usuario);
        cajaClave.sendKeys(clave);
        botonLogin.click();
    }
    
}
