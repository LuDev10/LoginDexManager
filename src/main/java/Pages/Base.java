package Pages;

import org.openqa.selenium.*;

public class Base {
    protected WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement username = (WebElement) jse.executeScript("return document.querySelector('dex-app').shadowRoot.querySelector('iron-pages').querySelector('dex-login').shadowRoot.querySelector('form').querySelector('div').querySelector('div > paper-input').shadowRoot.querySelector('paper-input-container>iron-input').querySelector('input')");
        username.sendKeys(Keys.chord(Keys.CONTROL, "a"));;
        username.sendKeys(Keys.DELETE);
        username.sendKeys("challengeqa");

    }

    public void ingresarContraseña() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement password = (WebElement) jse.executeScript("return document.querySelector('dex-app').shadowRoot.querySelector('iron-pages').querySelector('dex-login').shadowRoot.querySelector('form').querySelector('div >paper-input#password').shadowRoot.querySelector('paper-input-container>iron-input').querySelector('input')");
        password.sendKeys(Keys.chord(Keys.CONTROL, "a"));;
        password.sendKeys(Keys.DELETE);
        password.sendKeys("Abcd1234");

    }

    public void clickIniciarSesion() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement iniciarSesion = (WebElement) jse.executeScript("return document.querySelector('dex-app').shadowRoot.querySelector('iron-pages').querySelector('dex-login').shadowRoot.querySelector('form').querySelector('div>paper-button.accept-btn.login-btn')");
        jse.executeScript("arguments[0].click();", iniciarSesion);
    }

    public void visit(String url) {
        driver.get(url);
    }
}
