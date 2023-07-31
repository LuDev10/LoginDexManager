package Pages;

import org.openqa.selenium.*;

public class Login extends Base {


    public Login(WebDriver driver) {
        super(driver);
    }


    public void iniciarSesionUser() throws Exception {
        Thread.sleep(1000);
        ingresarUsuario();
        ingresarContraseña();
        clickIniciarSesion();
    }


}
