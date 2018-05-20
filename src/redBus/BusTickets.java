package redBus;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusTickets {
	WebDriver driver;

@BeforeMethod
public void Setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
}
@Test
public void selectBusOption(){
	driver.findElement(By.xpath("//div[@id='page_main_header']/nav/ul/li[1]/a")).click();
}

}
