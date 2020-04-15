package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
  By email_textbox =  By.xpath("//input[@id='user_email']");
  By password_textbox= By.xpath("//input[@id='user_password']");
  By login_button= By.xpath("//input[@value='Log In']");
  
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  public WebElement getEmail()
  {
	 return driver.findElement(email_textbox);
  }
  
  public WebElement getPassword()
  {
	 return driver.findElement(password_textbox);
  }
  
  public WebElement getLogin()
  {
	 return driver.findElement(login_button);
  }
  
  public WebElement getsigin()
  {
	 return driver.findElement(login_button);
  }
  
}
