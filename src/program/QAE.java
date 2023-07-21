package program;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class QAE {
public static void main (String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	//ChromeOptions co = new ChromeOptions();
	//co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
	System.out.println("Page opened");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder = \"Enter your name\"]")).sendKeys("Deepika");
	System.out.println("Name entered");
	driver.findElement(By.xpath("//input[@placeholder = \"Enter your email\"]")).sendKeys("deepika.yadavilli2@gmail.com");
	System.out.println("Email entered");
	driver.findElement(By.xpath("//input[@placeholder = \"Enter your phone\"]")).sendKeys("9550289437");
	System.out.println("Phone number entered");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
  System.out.println("moved to Choose file");
	StringSelection ss=new StringSelection("D:\\Deepika_Hashtg\\Y_Deepika.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    System.out.println("File upload successful");
	driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[6]/textarea")).sendKeys("Hai I am Deepika. I am interested in your job post. Kindly consider my profile for this position");
	System.out.println("Description Entered");
	driver.findElement(By.xpath("/html/body")).click();
  driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")).click();
  //driver.findElement(By.xpath("//*[text() = \"APPLY NOW\"]")).click();
 System.out.println("Apply now clicked");
Thread.sleep(6000);
	driver.close();
	System.out.println("Closed");
	 
}
	
}
