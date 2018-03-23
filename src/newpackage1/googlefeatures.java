package newpackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlefeatures {

	public static void main(String[] args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive6 = new ChromeDriver();
			drive6.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive6.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=jv6lWoyfCpDE8wfM1p3YDQ");
			drive6.findElement(By.xpath(".//*[@id='lst-ib']")).click();
			drive6.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Do a Barrel Roll");
			drive6.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
		}catch(Exception e){e.printStackTrace();}
    }
}


/*


public class registeripx {

	
	
	public static void RegisterUser(String collegename,String PRN,String name,String email,String username, String password,String course,String details,String city,String state)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("https://inpodsx.com/");
*/