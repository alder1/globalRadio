package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class lastPlayedSongsPage {
    WebDriver driver;

    public lastPlayedSongsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='header']/div[5]/div/div/h1")
    private WebElement radioText;

    @FindBy(xpath = ".//*[@id='song_promo_60357']/div/div[2]/div/div/a")
    private WebElement promises;

    public void assertPage(){
        System.out.println(radioText.getText());
        String expectedResult = "Radio";
        String actualResult = radioText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    public void selectPromises(){
        promises.click();
    }
}
