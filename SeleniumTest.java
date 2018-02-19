package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ibou/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver .manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("ibrahima");
		driver.findElement(By.xpath("//*[@id='u_0_p']/span[2]/label")).click();
		
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel1.selectByVisibleText("Sep");;
		
		Select sel2=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		sel2.selectByValue("6");
		
		Select sel3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		sel3.selectByIndex(3);;
		
		
		
		
		driver.findElement(By.xpath("//*[@id='u_0_r']")).click();
		

	}

}
