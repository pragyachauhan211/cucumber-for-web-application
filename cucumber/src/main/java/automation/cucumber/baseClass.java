package automation.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	public static WebDriver driver;
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.browserstack.com/users/sign_in";
		driver.get(url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
