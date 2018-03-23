package newpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive1 = new ChromeDriver();
			try{drive1.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");}catch(Exception e1){}
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id='identifierId']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("adeep.kulkarni@gmail.com");
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@name='password']")).sendKeys("abcd1234");
			Thread.sleep(2000);
			/*drive1.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			Thread.sleep(2000);
			try {drive1.findElement(By.xpath(".//*[@class='RveJvd snByac' and .='Done']")).click();}
			catch(Exception e){};
			Thread.sleep(10000);
			drive1.findElement(By.xpath("//*[.='COMPOSE' and @role='button']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':c4']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':c4']")).sendKeys("adeep.kulkarni@gmail.com");
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':c4']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':bn']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':bn']")).sendKeys("Test mail");
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':cp']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':cp']")).sendKeys("First automated mail using Selenium");
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id=':bd']")).click();
			Thread.sleep(3000);
			drive1.findElement(By.xpath(".//*[@href='https://accounts.google.com/SignOutOptions?hl=en-GB&continue=https://mail.google.com/mail&service=mail']")).click();
			Thread.sleep(2000);
			drive1.findElement(By.xpath(".//*[@id='gb_71']")).click();
			//Thread.sleep(2000);
			*/drive1.findElement(By.xpath(".//*[@jsname='bCkDte']")).click();
			//Thread.sleep(2000);
			//drive1.findElement(By.xpath(".//*[@id='next']/content/span")).click();
			Thread.sleep(4000);
			drive1.close();
			//drive1.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
			
		} catch(Exception e){e.printStackTrace();}
		}

	}/* .//*[@class='RveJvd snByac' and .='Done'] */


