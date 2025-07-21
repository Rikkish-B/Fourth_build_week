package pro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class search extends baseset{
	@Test
	void find() throws InterruptedException {
		 driver.findElement(By.className("search__form__input")).sendKeys("Shirt");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("search__form__input")).clear();
		 driver.findElement(By.xpath("//input[@class=\"search__form__input\"]")).sendKeys("Sneakers");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("search__form__input")).clear();
		 driver.findElement(By.xpath("//input[@class=\"search__form__input\"]")).sendKeys("Bag");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("search__form__input")).clear();
		 driver.findElement(By.xpath("//input[@class=\"search__form__input\"]")).sendKeys("Suit");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
