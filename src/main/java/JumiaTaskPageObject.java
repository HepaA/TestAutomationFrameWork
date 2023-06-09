import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JumiaTaskPageObject {
    public static WebElement ClosePobup(WebDriver driver) {
        By close = By.xpath("(//*[@aria-label=\"newsletter_popup_close-cta\"])[2]");
        WebElement closeelement = driver.findElement(close);
        return closeelement;
    }
    public static WebElement OpenAccountTab(WebDriver driver) {
        By open = By.xpath("(//*[@class=\"trig -df -i-ctr -fs16\"])[1]");
        WebElement accounttabelement = driver.findElement(open);
        return accounttabelement;
    }
    public static WebElement ClickSignInButton(WebDriver driver) {
        By signin = By.xpath("//*[@href=\"/customer/account/login/?return=%2F\"]");
        WebElement signinelement = driver.findElement(signin);
        return signinelement;
    }
    public static WebElement InsertEmailOrPhoneNumber(WebDriver driver) {
        By EmailOrPhoneNumber = By.xpath("//*[@id=\"input_identifierValue\"]");
        WebElement EmailOrPhoneNumberelement = driver.findElement(EmailOrPhoneNumber);
        return EmailOrPhoneNumberelement;
    }

    public static WebElement ContinueButtonOfEmail(WebDriver driver) {
        By continuebutton = By.xpath("(//*[@class=\"mdc-button__touch\"])[1]");
        WebElement continuebuttonelement = driver.findElement(continuebutton);
        return continuebuttonelement;
    }

    public static WebElement PasswordField(WebDriver driver) {
        By password = By.xpath("//*[@name=\"password\"]");
        WebElement passwordelement = driver.findElement(password);
        return passwordelement;
    }

    public static WebElement ContinueButtonOfPassword(WebDriver driver) {
        By passwordbutton = By.xpath("//*[@class=\"mdc-button__touch\"]");
        WebElement passwordbuttonelement = driver.findElement(passwordbutton);
        return passwordbuttonelement;
    }
    public static WebElement FirstBoxOfVerificationCode(WebDriver driver) {
        By firstbox = By.xpath("(//*[@class=\\\"mdc-text-field mdc-text-field--outlined mdc-text-field--no-label verification-code-component\\\"])[1]");
        WebElement firstboxelement = driver.findElement(firstbox);
        return firstboxelement;
    }

    public static WebElement SecondBoxOfVerificationCode(WebDriver driver) {
        By secondbox = By.xpath("(//*[@class=\\\"mdc-text-field mdc-text-field--outlined mdc-text-field--no-label verification-code-component\\\"])[2]");
        WebElement secondboxelement = driver.findElement(secondbox);
        return secondboxelement;
    }

    public static WebElement ThirdBoxOfVerificationCode(WebDriver driver) {
        By thirdbox = By.xpath("(//*[@class=\\\"mdc-text-field mdc-text-field--outlined mdc-text-field--no-label verification-code-component\\\"])[3]");
        WebElement thirdboxelement = driver.findElement(thirdbox);
        return thirdboxelement;
    }

    public static WebElement ForthBoxOfVerificationCode(WebDriver driver) {
        By forthbox = By.xpath("(//*[@class=\\\"mdc-text-field mdc-text-field--outlined mdc-text-field--no-label verification-code-component\\\"])[4]");
        WebElement forthboxelement = driver.findElement(forthbox);
        return forthboxelement;
    }

    public static WebElement ClickOnSuperMarketCategory(WebDriver driver) {
        By supermarket = By.xpath("//*[@href=\"/groceries/\"]");
        WebElement supermarketelement = driver.findElement(supermarket);
        return supermarketelement;
    }

    public static WebElement SelectFirstProductItem(WebDriver driver) {
        By firstproduct = By.xpath("//*[@data-src=\"https://eg.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/31/532722/1.jpg?8009\"]\n");
        WebElement firstproductelement = driver.findElement(firstproduct);
        return firstproductelement;
    }

    public static WebElement AddToCartButton(WebDriver driver) {
        By addtocart = By.xpath("//*[@class=\"add btn _prim -pea _i -fw\"]");
        WebElement addtocartelement = driver.findElement(addtocart);
        return addtocartelement;
    }

    public static WebElement ClickOnCartIcon(WebDriver driver) {
        By carticon = By.xpath("//*[@class=\"-df -i-ctr -gy9 -hov-or5 -phs -fs16\"]");
        WebElement carticonelement = driver.findElement(carticon);
        return carticonelement;
    }
    public static WebElement ClickOnCheckOutButton(WebDriver driver) {
        By checkout = By.xpath("//*[@href=\"/checkout\"]");
        WebElement checkoutelement = driver.findElement(checkout);
        return checkoutelement;
    }








}
