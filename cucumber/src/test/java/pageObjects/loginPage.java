package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	public WebDriver driver;
	public loginPage(WebDriver driver)
	{
	  this.driver = driver;
	}
	
	By signIn = By.xpath("(//h1[@class='heading'])[1]");
	
	public String sign()
	{
		return driver.findElement(signIn).getText();
	}
	

}
