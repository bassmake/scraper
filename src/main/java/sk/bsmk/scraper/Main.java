package sk.bsmk.scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Main {

    public static void main(String[] args) {
        google();
    }

    private static void google() {
        System.setProperty("webdriver.gecko.driver", "/opt/homebrew/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
            driver.get("https://google.com/ncr");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println("Scraper: first result for cheese: " + firstResult.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }

    private static void dummy(String[] args) throws InterruptedException {
        System.out.println("Scraper init");

        for (int i = waitTime(args); i >= 0; i--) {
            if (i == 0) {
                System.out.print("\rScraper finished");
            } else {
                System.out.printf("\rWill work for %d seconds", i);
                Thread.sleep(1_000);
            }
        }
    }

    private static int waitTime(String[] args) {
        if (args.length < 1) {
            return 3;
        }
        return Integer.parseInt(args[0]);
    }

}
