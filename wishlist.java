package pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class wishlist extends baseset {
	@Test
	void add() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
		 WebElement shoe = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Versace")));
		 shoe.click();
			WebElement wl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[6]")));
			wl.click();
           Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='/wishlist']")).click();
		 	
		 boolean Product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Versace']"))).isDisplayed();

	        if (Product) {
	            System.out.println(" Product is successfully added to the wishlist");
	        } else {
	            System.out.println(" Product is NOT visible in the wishlist");
	        }
		 
		 
	}
}
