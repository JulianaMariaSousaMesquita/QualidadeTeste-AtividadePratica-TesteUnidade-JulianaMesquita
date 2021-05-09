package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

class seleniumTestefuncional {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("https://localhost:5000/b"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void seleniumTesteFuncional() {
    // Test name:  Teste funcional com selenium
    // Step # | name | target | value
    // 1 | open | https://localhost:5000/ | 
    driver.get("https://localhost:5000/");
    // 2 | setWindowSize | 1004x708 | 
    driver.manage().window().setSize(new Dimension(1004, 708));
    // 3 | mouseOver | id=download-button | 
    {
      WebElement element = driver.findElement(By.id("download-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | mouseOut | id=download-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 5 | mouseOver | id=download-button | 
    {
      WebElement element = driver.findElement(By.id("download-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 6 | click | id=download-button | 
    driver.findElement(By.id("download-button")).click();
    // 7 | mouseOut | id=download-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 8 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 9 | type | id=email | carlos@gmail.com
    driver.findElement(By.id("email")).sendKeys("carlos@gmail.com");
    // 10 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 11 | mouseOver | id=log-in-btn | 
    {
      WebElement element = driver.findElement(By.id("log-in-btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | type | id=password | 124578
    driver.findElement(By.id("password")).sendKeys("124578");
    // 13 | click | id=log-in-btn | 
    driver.findElement(By.id("log-in-btn")).click();
    // 14 | mouseOut | id=log-in-btn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 15 | click | css=.material-icons | 
    driver.findElement(By.cssSelector(".material-icons")).click();
    // 16 | click | css=.modal-action | 
    driver.findElement(By.cssSelector(".modal-action")).click();
    // 17 | click | id=logo-container | 
    driver.findElement(By.id("logo-container")).click();
    // 18 | runScript | window.scrollTo(0,200) | 
    js.executeScript("window.scrollTo(0,200)");
    // 19 | click | css=.indicators | 
    driver.findElement(By.cssSelector(".indicators")).click();
    // 20 | click | css=.indicator-item:nth-child(2) | 
    driver.findElement(By.cssSelector(".indicator-item:nth-child(2)")).click();
    // 21 | click | css=.indicator-item:nth-child(3) | 
    driver.findElement(By.cssSelector(".indicator-item:nth-child(3)")).click();
    // 22 | mouseOver | css=li:nth-child(2) > .navbar-button | 
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 23 | click | css=li:nth-child(2) > .navbar-button | 
    driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button")).click();
    // 24 | mouseOut | css=li:nth-child(2) > .navbar-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 25 | click | css=.modal-footer-button | 
    driver.findElement(By.cssSelector(".modal-footer-button")).click();
    // 26 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 27 | type | id=email | juliana@gmail.com
    driver.findElement(By.id("email")).sendKeys("juliana@gmail.com");
    // 28 | type | id=nickName | juliana
    driver.findElement(By.id("nickName")).sendKeys("juliana");
    // 29 | type | id=password | 123456
    driver.findElement(By.id("password")).sendKeys("123456");
    // 30 | click | id=confirmPassword | 
    driver.findElement(By.id("confirmPassword")).click();
    // 31 | type | id=confirmPassword | 123456
    driver.findElement(By.id("confirmPassword")).sendKeys("123456");
    // 32 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 33 | click | id=recaptcha-anchor-label | 
    driver.findElement(By.id("recaptcha-anchor-label")).click();
    // 34 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 35 | mouseOver | id=sign-up-btn | 
    {
      WebElement element = driver.findElement(By.id("sign-up-btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 36 | click | id=sign-up-btn | 
    driver.findElement(By.id("sign-up-btn")).click();
    // 37 | mouseOut | id=sign-up-btn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 38 | click | css=.material-icons | 
    driver.findElement(By.cssSelector(".material-icons")).click();
    // 39 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 40 | type | id=password | 123456Ju
    driver.findElement(By.id("password")).sendKeys("123456Ju");
    // 41 | click | id=confirmPassword | 
    driver.findElement(By.id("confirmPassword")).click();
    // 42 | mouseOver | id=sign-up-btn | 
    {
      WebElement element = driver.findElement(By.id("sign-up-btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 43 | type | id=confirmPassword | 123456Ju
    driver.findElement(By.id("confirmPassword")).sendKeys("123456Ju");
    // 44 | click | id=sign-up-btn | 
    driver.findElement(By.id("sign-up-btn")).click();
    // 45 | mouseOut | id=sign-up-btn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 46 | click | css=.material-icons:nth-child(2) | 
    driver.findElement(By.cssSelector(".material-icons:nth-child(2)")).click();
    // 47 | click | css=.material-icons:nth-child(3) | 
    driver.findElement(By.cssSelector(".material-icons:nth-child(3)")).click();
    // 48 | click | css=.material-icons:nth-child(3) | 
    driver.findElement(By.cssSelector(".material-icons:nth-child(3)")).click();
    // 49 | doubleClick | css=.material-icons:nth-child(3) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".material-icons:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 50 | click | css=.material-icons:nth-child(3) | 
    driver.findElement(By.cssSelector(".material-icons:nth-child(3)")).click();
    // 51 | click | css=div:nth-child(3) .cal-cell:nth-child(3) > .cal-cell-top | 
    driver.findElement(By.cssSelector("div:nth-child(3) .cal-cell:nth-child(3) > .cal-cell-top")).click();
    // 52 | click | css=div:nth-child(4) .cal-cell:nth-child(4) > .cal-cell-top | 
    driver.findElement(By.cssSelector("div:nth-child(4) .cal-cell:nth-child(4) > .cal-cell-top")).click();
    // 53 | mouseOver | id=courses-button | 
    {
      WebElement element = driver.findElement(By.id("courses-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 54 | click | id=courses-button | 
    driver.findElement(By.id("courses-button")).click();
    // 55 | mouseOut | id=courses-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 56 | click | id=arrow-drop-down | 
    driver.findElement(By.id("arrow-drop-down")).click();
    // 57 | click | id=contact-button | 
    driver.findElement(By.id("contact-button")).click();
    // 58 | mouseOver | id=settings-button | 
    {
      WebElement element = driver.findElement(By.id("settings-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 59 | click | id=settings-button | 
    driver.findElement(By.id("settings-button")).click();
    // 60 | mouseOut | id=settings-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 61 | click | css=.col:nth-child(1) .lever | 
    driver.findElement(By.cssSelector(".col:nth-child(1) .lever")).click();
    // 62 | click | css=.col:nth-child(4) p | 
    driver.findElement(By.cssSelector(".col:nth-child(4) p")).click();
    // 63 | click | css=.col:nth-child(4) label | 
    driver.findElement(By.cssSelector(".col:nth-child(4) label")).click();
    // 64 | click | css=.col:nth-child(5) .lever | 
    driver.findElement(By.cssSelector(".col:nth-child(5) .lever")).click();
    // 65 | click | css=.col:nth-child(2) .lever | 
    driver.findElement(By.cssSelector(".col:nth-child(2) .lever")).click();
    // 66 | click | css=.col:nth-child(3) .lever | 
    driver.findElement(By.cssSelector(".col:nth-child(3) .lever")).click();
    // 67 | click | css=.file-drop-zone | 
    driver.findElement(By.cssSelector(".file-drop-zone")).click();
    // 68 | click | css=.label-input-file | 
    driver.findElement(By.cssSelector(".label-input-file")).click();
  }
}