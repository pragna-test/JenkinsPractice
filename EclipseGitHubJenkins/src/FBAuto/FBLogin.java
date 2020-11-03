package FBAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		//browser instance
		WebDriver driver=new ChromeDriver();
		//test appl
		driver.get("http:\\www.facebook.com");
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Login email
		WebElement loginemail=driver.findElement(By.name("email"));
		loginemail.sendKeys("TesterOne@email.com");
		//password
		driver.findElement(By.name("pass")).sendKeys("password123");
		Thread.sleep(4000);
		//close and quit browser
		  driver.quit();
		  
		  System.out.println("successfully execute");

	}

}
