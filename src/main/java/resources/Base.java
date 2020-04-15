package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
  public WebDriver driver;
  public WebDriver intializeDriver() throws IOException
  {
	  Properties prop = new Properties();
	  FileInputStream fis = new FileInputStream("C://Users//Dell//eclipse-workspace//E2EProject//src//main//java//resources//data.properties");
	  prop.load(fis);
	  String browser_name = prop.getProperty("browser");
	  if (browser_name.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D://Browser-server//chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browser_name.equals("firefox"))
	  {
		  //fire code
	  }
	  else if(browser_name.equals("IE"))
	  {
		   //IE code
	  }
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  return driver;
  }
}
