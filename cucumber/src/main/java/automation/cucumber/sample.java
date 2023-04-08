package automation.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sample extends baseClass{
	
	public void abc()
	{
		WebElement e = driver.findElement(By.xpath("(//h1[@class='heading'])[1]"));
	    String content = e.getText();
	    System.out.println(content);
	}
	
	}




