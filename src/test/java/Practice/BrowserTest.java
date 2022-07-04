//package Practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import javax.swing.*;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//
//public class BrowserTest {
//    //ChromeDriver driver;
//    WebDriver driver;
//
//
//
//@BeforeMethod(alwaysRun = true)
//public void openBrowser(){
//    log.info("Initialize ChromeWebDriver");
//    wait = new WebDriverWait(driver)
//    ChromeOptions chromeOptions = new ChromeOptions();
////     chromeOptions.setCapability("browserVersion", "103");
//    chromeOptions.setCapability("platformName", "Windows");
//    chromeOptions.setCapability("se:name", "My simple test");
//    driver = new RemoteWebDriver(new URL("http://192.168.8.100:4444"), chromeOptions);
//    driver.manage().window().maximize();
//    driver.manage()
//            .timeouts()
//            .implicitlyWait(2000, TimeUnit.SECONDS);
//
//
//}
//
//    @Test
//    public void chromeDriverTest() {
//
//        driver.get("https://google.lv");
//        Assert.assertEquals(driver.getTitle(),"Google");
//        ChromeDriver driver = new ChromeDriver();
//
//    }
//    @AfterMethod(alwaysRun = true)
//    public void closeBrowser(){
//    driver.close();
//
//    }
//
//    @Test
//    public void chromeDriverTest2() {
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("http://google.lv");
//
//
//        @Test
//             public void elementTest(){
//           driver.get(LOCAL_FILE);
//           //driver.findElement()
//        }
//
//        @Test
//        public void elementTest() {
//            driver.get(LOCAL_FILE);
//            WebElement nameField = driver.findElement(By.id("fNameID"));
//            nameField.sendKeys("John");
//            WebElement lastName = driver.findElement(By.id("lNameID"));
//            lastName.sendKeys("Doe");
//            WebElement ckeckData = driver.findElement(By.xpath("//button[@checkDataID]"));
//            mainPage = new MainPage(driver);
//            mainPage.setFirstName("John");
//            Assert.assertEquals(mainPage.getStudentCheckBox().isSelected(), false);
//            mainPage.selectStudentCheckBox();
//            Assert.assertEquals(mainPage.getStudentCheckBox().isSelected(), true);
//            Assert.assertFalse(mainPage.getStudentCheckBox().isSelected());
//            mainPage.selectStudentCheckBox();
//            Assert.assertTrue(mainPage.getStudentCheckBox().isSelected());
//
//
//        }
//        @Test
//            public void actionTest(){
//            driver.get(LOCAL_FILE);
//            new Action(driver).moveToElement(driver.findElement(By.id("aboutMeId"))).sendKeys(Keys.ALT, "A").perform();
//            Actions actions = new  Actions(driver);
//            actions.moveToElement(driver.findElement(By.id("aboutMeID")))
//                    .keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
//                    .keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND)
//                    .keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
//
//
//        }
//        }
//
//
//    }
//
