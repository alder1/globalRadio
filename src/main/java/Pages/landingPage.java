package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
    WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='privacy-overlay']/a")
    private WebElement okCookie;

    @FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/ul/li[1]/a")
    private WebElement lastPlayedButton;

    public void selectCookie(){
        okCookie.click();
    }

    public void selectButton(){
        lastPlayedButton.click();
    }
}