package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By user=By.id("email1");
	
	By pass=By.name("password1");
	
	By login=By.xpath("//button[normalize-space()='Sign in']");
	
	public void loginToApplication(String username,String password)
	{
		//screen shot of login page
		helper.Utility.captureScreenshot(driver);
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		//screen shot after entering login page
		helper.Utility.captureScreenshot(driver);
		driver.findElement(login).click();
		
	}

}
