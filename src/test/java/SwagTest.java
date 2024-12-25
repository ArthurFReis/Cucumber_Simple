import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NoSuchDriverException;


public class SwagTest {

    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

    }
    @After
    public void tearDown() {
       // driver.quit();
    }

    @Test
    public void swag() throws NoSuchDriverException {

        for(int i = 0; i<5; i++){
            driver.get("https://www.saucedemo.com/");

//            driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
//            driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
//            driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
//            driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
//            driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
            driver.findElement(By.id("user-name")).click();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        }
    }
}
