package gittest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitDemoScript {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("alertButton")).click();
        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
	System.out.println("Inside the Branch-1");
	System.out.println("Adding print statement for new branch");
	System.out.println("Change made to reflect");
		System.out.println("Change made on github website");
		System.out.println("Change made on github website to show use of pull");
		
        myAlert.accept();
	}

}
