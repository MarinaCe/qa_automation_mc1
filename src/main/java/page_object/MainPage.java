//package page_object;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class MainPage {
// private WebDriver driver;
//
//
//    public MainPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//
//    private By firstNameField = By.id("fNameID");
//
//    public WebElement getFirstNameField() {
//        return driver.findElement(firstNameField);
//    }
//
//    public void setFirstName(String value) {
//        driver.findElement(firstNameField).sendKeys(value);
//    }
//    public void clickOnMe() {
//        driver.findElement(clickOnMeButton).click();
//    }
//    private By clickOnMeButton = By.xpath("//button[@id='checkDataID']");
//    private By studentCheckBox = By.xpath("//input[@id='studentID' and @type='checkbox']");
//    public void selectStudentCheckBox() {
//        driver.findElement(studentCheckBox).click();
//    }
//
//    public WebElement getStudentCheckBox() {
//        return driver.findElement(studentCheckBox);
//    }
//    //private By studentCheckBox = By.xpath("//input[@id='studentID' and @type='checkbox']");
//    @Test
//    public void testTab(){
//        driver.get(LOCAL_FILE);
//        driver.findElement(By.linkText("LinkedIn")).click();
//        System.out.println("123");
//        Array<String> tabs=new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(0));
//        System.out.println();
//    }
//    @Test
//    public void javascriptTest(){
//        driver.get("http://www.lu.lv");
//        WebElement kontakt = driver.findElement(By.ByLinkText("Kontakti"));
//        ((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);", kontakt);
//    }
//
//}
//
