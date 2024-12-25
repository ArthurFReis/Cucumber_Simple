package Steps;





import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {



    private WebDriver driver;

    @Given("Go into website")
    public void go_into_website()  {
        System.setProperty("web driver.chrome.driver", "drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


    }
    @When("put user and put the password")
    public void putUserAndPutThePassword() {
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }


    @Then("Finish the test")
    public void finishTheTest()  {
            driver.quit();

        }


}

