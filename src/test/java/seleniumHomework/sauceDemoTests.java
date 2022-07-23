package seleniumHomework;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.security.auth.login.LoginContext;

@Log4j
@Setter
@Getter

/*1. Scenārijs

        1. Navigēt uz saiti https://www.saucedemo.com/
        2. Ielogoties ar pareizu lietotāja vārdu/paroli
        3. Pārbaudīt, ka lietotājs ir ielogojies
        4. Ievietot Grozā 1 produktu
        5. Doties uz grozu
        6. Pārbaudīt, kā šī prece ir grozā
        7. Doties uz Checkout
        8. Ievadīt vārdu/uzvārdu/pasta indeksu
        9. Doties uz Checkout overview lapu, pārbaudīt datus
        10. Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi
        11. Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'
*/

public class sauceDemoTests {
    ChromeDriver driver;
    LoginPage loginPage;
    InvertoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;


    @BeforeMethod(alwaysRun = true)
    public void userLogin(){
        this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        loginPage = new LoginPage(driver);
        loginPage.setUserName("standart_user");
        loginPage.setPassword("secret_sauce");
    }
    @Test
    public void firstScenario(){
        inventoryPage = new InventoryPage(driver);
        inventoryPage.getInventoryItem().click();
        inventoryPage.getAddToCard().click();
        cartPage = new CartPage (driver);
        cartPage.getCheckout().click();
        checkoutPage.setCheckoutFirstName("Marina");
        driver.findElement(first-name).sendKeys(value);
        checkoutPage.setCheckoutLastName("Celika");
        checkoutPage.setCheckoutPostal-Code("LV-1050");
        checkoutPage.getCheckoutContinue().click();
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.getButtonFinish().click();
        checkoutSuccessPage = new CheckoutSuccessPage (driver);
        checkoutSuccessPage.getButtonBackHome().click();

    }

}
