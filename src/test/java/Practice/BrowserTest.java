package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserTest {
    ChromeDriver driver;



@BeforeMethod(alwaysRun = true)
public void openBrowser(){
    this.driver = new ChromeDriver();
    driver.get("http://google.lv");

}

    @Test
    public void chromeDriverTest() {

        driver.get("https://google.lv");
        Assert.assertEquals(driver.getTitle(),"Google");
        ChromeDriver driver = new ChromeDriver();

    }
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
    driver.close();

    }

    @Test
    public void chromeDriverTest2() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.lv");


        /*@Test
       /*        public void elementTest(){
           driver.get(LOCAL_FILE);
           //driver.findElement()
        }

        @Test
        public void elementTest() {
            driver.get(LOCAL_FILE);
            WebElement nameField = driver.findElement(By.id("fNameID"));
            nameField.sendKeys("John");
            WebElement lastName = driver.findElement(By.id("lNameID"));
            lastName.sendKeys("Doe");
            WebElement ckeckData = driver.findElement(By.xpath("//button[@checkDataID]"));
            mainPage = new MainPage(driver);
            mainPage.setFirstName("John");
            Assert.assertEquals(mainPage.getStudentCheckBox().isSelected(), false);
            mainPage.selectStudentCheckBox();
            Assert.assertEquals(mainPage.getStudentCheckBox().isSelected(), true);
            Assert.assertFalse(mainPage.getStudentCheckBox().isSelected());
            mainPage.selectStudentCheckBox();
            Assert.assertTrue(mainPage.getStudentCheckBox().isSelected());


        }*/
        }
    }

