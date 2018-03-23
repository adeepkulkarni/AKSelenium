package datax;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registeripx {

	public static void main(String[] args)
	{
		RegisterUser("PICT","1234","Yuvraj Singh","adeepkulkarni@hotmail.com","YuvrajSingh","yuvraj666666","Computer Engineering","I am interested in taking up new courses to learn more of what I am doing currently","Mumbai","Maharashtra");
    }
	
	public static void RegisterUser(String collegename,String PRN,String name,String email,String username, String password,String course,String details,String city,String state)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("https://inpodsx.com/");
			Thread.sleep(5000);
			drive5.findElement(By.xpath(".//*[@href='/register']")).click();
			Thread.sleep(5000);
			drive5.findElement(By.xpath(".//*[@id='register-institute_name']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-institute_name']")).sendKeys(collegename);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-prn']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-prn']")).sendKeys(PRN);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-name']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-name']")).sendKeys(name);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-email']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-email']")).sendKeys(email);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-gender']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@value='m'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-level_of_education']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='b']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-username']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-username']")).sendKeys(username);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-password']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-password']")).sendKeys(password);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-city_new'] ")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-city_new'] ")).sendKeys(city);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(" .//*[@id='register-state']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(" .//*[@id='register-state']")).sendKeys(state);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-country']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='IN']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-program_n_year']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-program_n_year']")).sendKeys(course);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-goals']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-goals']")).sendKeys(details);
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@id='register-honor_code']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@class='action action-primary action-update js-register register-button']")).click();
			Thread.sleep(1000);
	}catch(Exception e3){}
	}
}
/*   
 *//*  "I am interested in taking up new courses to learn more of what I am doing currently"
 * import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele3 {
	public static void main (String[]args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(".//*[@href='./basic-radiobutton-demo.html']")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath("(.//*[@value='Female'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@class='btn btn-default'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@value='Male'])[2]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='15 - 50']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@onclick='getValues();']")).click();
			Thread.sleep(2000);
}catch(Exception e7){}
		}
	}
 */
