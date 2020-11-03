package FBAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRegistration {

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
				//click create new account
				driver.findElement(By.linkText("Create New Account")).click();
				Thread.sleep(3000);
				//enter first name
				driver.findElement(By.name("firstname")).sendKeys("tester");
				//enter lastname
				driver.findElement(By.name("lastname")).sendKeys("sample");
				Thread.sleep(2000);
				driver.quit();

	}

}
