import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Jumiatask {
    WebDriver driver = null;
    JumiaTaskPageObject jumiapageobject;
    @Test (priority = 0)
    public void OpenJumiaAndSignInWithValidData () throws InterruptedException {
        String NewTab = System.getProperty("user.dir") + "\\chrome driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", NewTab);
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.navigate().to("https://www.jumia.com.eg/");
        jumiapageobject = new JumiaTaskPageObject();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //CloseDisplayedPobupWhenOpenTheSite
        jumiapageobject.ClosePobup(driver).click();
            //AccountTab:
            Thread.sleep(3000);
            jumiapageobject.OpenAccountTab(driver).click();
            //SignInButton:
            jumiapageobject.ClickSignInButton(driver).click();
            Thread.sleep(2000);
            //Email/PhoneNumberField:
            jumiapageobject.InsertEmailOrPhoneNumber(driver).click();
            jumiapageobject.InsertEmailOrPhoneNumber(driver).sendKeys("");
            //ContinueButtonOfEmail/PhoneNumber
            Thread.sleep(2000);
            jumiapageobject.ContinueButtonOfEmail(driver).click();
            Thread.sleep(3000);
            //PasswordField:
            jumiapageobject.PasswordField(driver).sendKeys("");
            //ContinueButtonAfterInsertingPassword:
            jumiapageobject.ContinueButtonOfPassword(driver).click();
            Thread.sleep(2000);
        //FirstBoxOfVerificationCode:
        jumiapageobject.FirstBoxOfVerificationCode(driver).click();
        jumiapageobject.FirstBoxOfVerificationCode(driver).sendKeys("1");
        Thread.sleep(2000);
        //SecondBoxOfVerificationCode:
        jumiapageobject.SecondBoxOfVerificationCode(driver).click();
        jumiapageobject.SecondBoxOfVerificationCode(driver).sendKeys("1");
        Thread.sleep(2000);
        //ThirdBoxOfVerificationCode:
        jumiapageobject.ThirdBoxOfVerificationCode(driver).click();
        jumiapageobject.ThirdBoxOfVerificationCode(driver).sendKeys("1");
        Thread.sleep(2000);
        //ForthBoxOfVerificationCode:
        jumiapageobject.ForthBoxOfVerificationCode(driver).click();
        jumiapageobject.ForthBoxOfVerificationCode(driver).sendKeys("2");
        Thread.sleep(3000);
        driver.quit();

    }

    @Test (priority = 1)
    public void SelectItemAndAddItToCart() throws InterruptedException {
        String NewTab = System.getProperty("user.dir") + "\\chrome driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", NewTab);
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.navigate().to("https://www.jumia.com.eg/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        jumiapageobject.ClosePobup(driver).click();
        Cookie CurrentCookie = driver.manage().getCookieNamed("_formy_session");
        //SelectFirstCategory(Supermarket):
        Thread.sleep(2000);
        jumiapageobject.ClickOnSuperMarketCategory(driver).click();
        Thread.sleep(2000);
        //SelectFirstProductItemInSuperMarketCategory:
        jumiapageobject.SelectFirstProductItem(driver).click();
        Thread.sleep(3000);
        //ClickOnAddToCartButton:
        jumiapageobject.AddToCartButton(driver).click();
        Thread.sleep(3000);
        //ClickOnCartIcon:
        jumiapageobject.ClickOnCartIcon(driver).click();
        //ClickOnCheckOutButton:
        jumiapageobject.ClickOnCheckOutButton(driver).click();
        Thread.sleep(3000);
       driver.quit();
    }
    }


