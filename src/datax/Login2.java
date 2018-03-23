package datax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
	static WebDriver drive5=null;
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
		 drive5 = new ChromeDriver();
		drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginUser("mayurkmulay@gmail.com","Mayurm@123");
		//EnrollCourse(); 
		//StartCourse();
		//AddDisc();
	}
	
	public static void LoginUser(String email,String password)
	{
		try{
		
			drive5.get("https://inpodsx.com/");
		Thread.sleep(2000);
		drive5.findElement(By.xpath(".//*[@href='/login']")).click();
		Thread.sleep(2000);
		drive5.findElement(By.xpath(".//*[@id='login-email']")).click();
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@id='login-email']")).sendKeys(email);
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@id='login-password']")).click();
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@id='login-password']")).sendKeys(password);
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@class='action action-primary action-update js-login login-button']")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) drive5)
	     .executeScript("window.scrollTo(0, (document.body.scrollHeight)/2)");
		drive5.findElement(By.xpath("(.//*[@data-course-key='course-v1:Unifyx+DAT203.1x+2017'])[3]")).click();
		Thread.sleep(2000);
		drive5.findElement(By.xpath(".//*[@class='last-accessed-link']")).click();
		Thread.sleep(2000);
		drive5.findElement(By.xpath(".//*[@href='/courses/course-v1:Unifyx+DAT203.1x+2017/discussion/forum/']")).click();
		Thread.sleep(2000);
		drive5.findElement(By.xpath("(.//*[@class='forum-nav-browse-title'])[1]")).click();
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@class='thread-preview-body']")).click();
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@class='wmd-input']")).click();
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@class='wmd-input']")).sendKeys("Check online for solutions");
		Thread.sleep(1000);
		drive5.findElement(By.xpath(".//*[@class='btn discussion-submit-post control-button']")).click();
		Thread.sleep(2000);
	}catch(Exception e8){e8.printStackTrace();}
	}
}
	

/*
 * 




((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView();", element);
            */
 
		