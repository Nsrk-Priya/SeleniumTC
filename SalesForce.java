package SeleniumTC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk\r\n"+"");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("UserFirstName")).sendKeys("Priya");
        driver.findElement(By.name("UserLastName")).sendKeys("s");
        driver.findElement(By.name("UserEmail")).sendKeys("Priya@qeagle.com");
        
        WebElement title = driver.findElement(By.name("UserTitle"));
        Select job = new Select(title);
        job.selectByIndex(5);
        
        driver.findElement(By.name("CompanyName")).sendKeys("TL");
        
        WebElement emp = driver.findElement(By.name("CompanyEmployees"));
        Select empcount = new Select(emp);
        empcount.selectByValue("250");
        
        driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
        
        WebElement country = driver.findElement(By.name("CompanyCountry"));
        Select getcountry = new Select(country);
        getcountry.selectByVisibleText("India");
        
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();

}
}
