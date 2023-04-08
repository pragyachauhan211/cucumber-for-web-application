package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;
import utilities.common;

public class loginPageStepDefinition {
    
	common Common;
	
	public loginPageStepDefinition(common Common) {
		this.Common = Common;
	}

	@When("^Fetch sign in content from login page$")
	public void fetch_sign_in_content_from_login_page() throws Throwable {
		
		loginPage pg = new loginPage(Common.driver);
		String check = pg.sign();
		Thread.sleep(3000);
		Common.driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		//WebElement SignInContent = Common.driver.findElement(By.xpath("(//h1[@class='heading'])[1]"));
		//Common.SignIn = SignInContent.getText();
		System.out.println("Sign in content is fetched: "+check);
	}

	@Given("^User is at login page$")
	public void user_is_at_login_page() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//test.properties");
		Properties prop = new Properties();
		prop.load(fis);	
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		Common.driver = new ChromeDriver();
		String url = prop.getProperty("Qurl");
		Common.driver.get(url);
		Common.driver.manage().window().maximize();
		System.out.println("User is at login page");
	}

	@When("^User login into page with it username and password$")
	public void user_login_into_page_with_username_and_password() throws InterruptedException {
		Thread.sleep(3000);
		Common.driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		Common.driver.findElement(By.xpath("(//input[@class = 'input-lg text user_email_ajax'])[1]"))
				.sendKeys("Pragya");
		Thread.sleep(2000);
		Common.driver.findElement(By.xpath("(//input[@class = 'input-lg text'])[2]")).sendKeys("Pragya123");
		Common.driver.findElement(By.xpath("//input[@id = 'user_submit']")).click();
	}

	@When("User login to the page with {string} and password {string}")
	public void user_login_to_the_page_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("Username is " + strArg1);
		System.out.println("Password is " + strArg2);
	}

	@When("^User sign up with below details$")
	public void user_sign_up_with_below_details(DataTable data) throws Throwable 
	{
		System.out.println(data);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Pop up auto populated");
	}

	@And("^UI is also looking proper$")
	public void ui_is_also_looking_proper() {
		System.out.println("UI is proper");
	}

	@And("^UI is not proper$")
	public void ui_is_not_proper() throws Throwable {
		System.out.println("UI is not proper");

	}

	@When("^User login to the page with it (.+) and (.+)$")
	public void user_login_to_the_page_with_it_and(String username, String password) throws Throwable {
		System.out.println("Username is " + username);
		System.out.println("Password is " + password);
	}

}
