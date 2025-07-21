package pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class homepage extends baseset {
	
	
	
	@Test
	public void sub() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	  WebElement kids = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Kids")));
	  kids.click();
	  Thread.sleep(3000);
	 
	  WebElement men = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Men")));
	  men.click();
	  Thread.sleep(3000);
	  
	  WebElement women = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Women")));
	  women.click();
	  Thread.sleep(3000);
	 
	  WebElement shop = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shop")));
	 shop.click();
	 Thread.sleep(3000);
	 
	  WebElement home = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
		 home.click();
	  
		
		
	}

	
	
}
