package pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class checkout extends baseset {
   
	@Test
	void check() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
		 WebElement shoe = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Versace")));
		 shoe.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
		  Thread.sleep(2000);
		  driver.findElements(By.cssSelector(".MuiBadge-root.BaseBadge-root.css-1rzb3uu")).get(1).click();

		  Thread.sleep(3000);
		  boolean co = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Versace']"))).isDisplayed();

	        if (co) {
	            System.out.println(" Product is successfully added to the cart");
	        } else {
	            System.out.println(" Product is NOT visible in the cart");
	        }
	        driver.findElement(By.cssSelector(".MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root  css-79xub")).click();
	        WebElement checkoutButton = driver.findElement(By.cssSelector(".checkout__button"));
	        checkoutButton.click();
	        
	 
	        boolean isOrderSuccess = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "Your order has been placed successfully"));
	        if (isOrderSuccess) {
	            System.out.println("Order placed successfully");
	        } else {
	            System.out.println("Order placement failed");
	        }

	        
	        
	}
	
	
}
