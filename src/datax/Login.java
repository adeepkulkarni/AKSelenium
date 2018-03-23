package datax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static WebDriver drive5=null;
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
		 drive5 = new ChromeDriver();
		drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginUser("adeepkulkarni@hotmail.com","yuvraj666666");
		//EnrollCourse();
		//StartCourse();
		AddDisc();
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
		Thread.sleep(1000);
		
	}catch(Exception e8){e8.printStackTrace();}}
		
		public static void EnrollCourse()
		{
			try{
			
			//drive5.get("https://inpodsx.com/");
			//Thread.sleep(2000);
			drive5.findElement(By.xpath("(.//*[@href='/courses'])[2]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(".//*[@href='/courses?search_query=&c=Computer&d=All']")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath("(.//*[@class='course-title'])[2]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@class='register']")).click();
			Thread.sleep(1000);
			
		}catch(Exception e8){e8.printStackTrace();}
	}
		
		public static void StartCourse()
		{
			try{
				drive5.findElement(By.xpath("(.//*[@href='/courses/course-v1:Unifyx+DAT203.1x+2017/info'])[3]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='last-accessed-link']")).click();
				Thread.sleep(2000);
				//drive5.findElement(By.xpath("(.//*[@class='group-heading'])[1]")).click();
				//Thread.sleep(2000);
				//drive5.findElement(By.xpath(".//*[.='Principles of Data Science ']")).click();
				//Thread.sleep(3000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(3000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				//drive5.findElement(By.xpath(".//*[@title='Pause']")).click();
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				//drive5.findElement(By.xpath(".//*[.='Data Science Technologies ']")).click();
				//Thread.sleep(3000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(4000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='control video_control play']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='sequence-nav-button button-next'])[1]")).click();
				Thread.sleep(2000);
			}catch(Exception e5){e5.printStackTrace();}
		}
		
		public static void AddQue()
		{
			try{
				drive5.findElement(By.xpath(".//*[@class='enter-course']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@href='/courses/course-v1:Unifyx+DAT203.1x+2017/discussion/forum/']")).click();
				Thread.sleep(3000);
				drive5.findElement(By.xpath(".//*[@class='btn btn-small new-post-btn']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@for='form-12-post-type-question']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@aria-describedby='field_help_topic_area']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='topic-title'])[6]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).sendKeys("Machine issue");
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@id='wmd-input-js-post-body-undefined']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@id='wmd-input-js-post-body-undefined']")).sendKeys("How to Create Machine Learning Model?");
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='btn-brand submit']")).click();
				Thread.sleep(3000);
			}catch(Exception e7){e7.printStackTrace();}
		}
		
		public static void AddDisc()
		{
			try{
				drive5.findElement(By.xpath(".//*[@class='enter-course']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@href='/courses/course-v1:Unifyx+DAT203.1x+2017/discussion/forum/']")).click();
				Thread.sleep(3000);
				drive5.findElement(By.xpath(".//*[@class='btn btn-small new-post-btn']")).click();
				Thread.sleep(2000);
				//drive5.findElement(By.xpath(".//*[@for='form-12-post-type-question']")).click();
				//Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@aria-describedby='field_help_topic_area']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath("(.//*[@class='topic-title'])[6]")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).sendKeys("Machine issue");
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='js-post-title field-input']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@id='wmd-input-js-post-body-undefined']")).click();
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@id='wmd-input-js-post-body-undefined']")).sendKeys("How to Create Machine Learning Model?");
				Thread.sleep(2000);
				drive5.findElement(By.xpath(".//*[@class='btn-brand submit']")).click();
				Thread.sleep(3000);
			}catch(Exception e7){e7.printStackTrace();}
		}
}

//
//