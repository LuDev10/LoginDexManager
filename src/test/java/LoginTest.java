import Pages.Login;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;
    private Login sprintDosPage;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "../PruebaLuis/chromedriver_win3/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        sprintDosPage = new Login(driver);
        sprintDosPage.visit("https://demo.dexmanager.com/");
    }


    @Test
    public void login() throws Exception {
        sprintDosPage.iniciarSesionUser();
    }


    @After
    public void teardown() {
        driver.quit();
    }
}
