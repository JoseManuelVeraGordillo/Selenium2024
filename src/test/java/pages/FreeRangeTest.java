package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
    private WebDriver driver;
    // previo a la ejecucion de la prueba
    @BeforeMethod
    public void setUp(){
        //inicializar el WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    // prueba a realizar en este caso es solamente ver una pag objetivo
    @Test
    public void navegamosAFreeRangeTesters(){
        //navego a la pag objetivo
        driver.get("https://www.freerangetesters.com/");
    }
    
    // cierre del navegador una vez teminada la prueba
   @AfterMethod
    public void tearDown(){
        //cierro el navegador despues de la prueba
    if(driver !=null){
        driver.quit();
    }
    }
}
