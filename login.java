package pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login extends baseset {
  

    @Test
    void register() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/account/login\"]"))).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create account")));
        WebElement createAccountLink = driver.findElement(By.linkText("Create account"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", createAccountLink);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fname__input.register__input"))).sendKeys("Rikkish");
        driver.findElement(By.cssSelector(".lname__input.register__input")).sendKeys("Basavarj");
        driver.findElement(By.cssSelector(".email__input.register__input")).sendKeys("rikidhanu933@gmail.com");
        driver.findElement(By.cssSelector(".password__input.register__input")).sendKeys("Rikidhanu1404@");

        WebElement registerButton = driver.findElement(By.cssSelector(".register__button"));
        if (registerButton.isDisplayed() && registerButton.isEnabled()) {
            registerButton.click();
            System.out.println("Register button clicked successfully.");
        } else {
            System.out.println("Register button is not clickable.");
        }

        boolean isSuccess = wait.until(ExpectedConditions.or(
            ExpectedConditions.urlContains("success"),
            ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "Welcome")
        ));

        if (isSuccess) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration might have failed.");
        }
    }
}
