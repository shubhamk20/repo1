package toolsqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Home {
	WebDriver driver;
  @Test
  public void f() {
//	  System.out.println(driver.findElement(By.xpath("//*[@id=\"slide-16-layer-2\"]")).getAttribute("innerHtml").toString());
	  Actions builder=new Actions(driver);
	  builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[8]"))).perform();
	  driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[8]/ul/li[1]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://toolsqa.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
