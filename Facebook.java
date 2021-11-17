package SeleniumTC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Priya");
        driver.findElement(By.name("lastname")).sendKeys("Gandhi");
        driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
        driver.findElement(By.id("password_step_input")).sendKeys("SeleniumTC1");
        //day drop down
        WebElement day = driver.findElement(By.id("day"));
        Select getday= new Select(day);
        getday.selectByValue("23");
        //month drop down
        WebElement month = driver.findElement(By.id("month"));
        Select getmonth= new Select(month);
        getmonth.selectByIndex(1);
        //Year drop down
        WebElement year = driver.findElement(By.id("year"));
        Select getyear= new Select(year);
        getyear.selectByValue("1996");
        driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
        
	}

}
