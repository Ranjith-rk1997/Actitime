package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	static {
 System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	}
	WebDriver driver;
	
	@Given("user should navigate to the application")
    public void userShouldNavigateToTheApplication() {
		//System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://bookcart.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("user clicks on the login button")
	public void userClicksOnTheLoginButton() {
	    driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@Given("user enters the username as ortoni")
	public void userEntersTheUsernameAsOrtoni() {
	   driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("ortoni");
	}

	@Given("user entered the password as pass1234")
	public void userEnteredThePasswordAsPass() {
	   driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys("pass1234");
	}

	@When("user click the login button")
	public void userClickTheLoginButton() {
	   driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	}
	@Then("login should be success")
	public void loginShouldBeSuccess() {
	String text = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]/mat-icon[1]")).getText();
	System.out.println(text);
	driver.quit();
	}

	
}

