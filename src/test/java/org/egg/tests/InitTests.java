package org.egg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class InitTests {
    private static WebDriver driver; // Driver estático global

    // Getter del driver
    public static WebDriver getDriver() {
        return driver;
    }

    @Before // Before para que se ejecute antes de cada prueba, BeforeAll para que se ejecute al inicio de todas
    public static void openDriver(){
        if(driver ==null){
            driver = new FirefoxDriver(); // Abre el Driver
        }
    }

    @After // Before para que se ejecute antes de cada prueba, AfterAll para que se ejecute al final de todas
    public static void closeDriver() throws InterruptedException{
        Thread.sleep(1000); // Espera para alcanzar a ver el resultado antes de que cierre el navegador
        if (driver != null){
            driver.quit(); // Cierra el driver
            driver = null; // Limpia la referencia para la siguiente prueba
        }
    }

}
