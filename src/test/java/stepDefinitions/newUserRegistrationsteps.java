package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;


public class newUserRegistrationsteps {

    WebDriver driver;

        @Given("I Launch the browser")
        public void launchbrowser () {
            driver = new ChromeDriver();
        }

        @When("I provide the URL for registration page")
        public void navigatetopage () {
            driver.get("https://www.orangecrm.com/");
        }

        @Then("User Registration page is loaded")
        public void pageloadandseelogo () {
        var y="ORANGE CRM";
            var x=driver.findElement(By.cssSelector("h1.wow.fadeInDownBig.animated")).getText();
            System.out.println(x);
            assertEquals(x,y);
        }

        @And("Close browser")
        public void closeBrowser () {
            driver.quit();
          }

    }
