package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class albumPage {
    WebDriver driver;

    public albumPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='ember205']/section[1]/div/div[2]/div[1]/div[2]/header/h1/span[1]")
    private WebElement promisesAlbum;

     public boolean assertpromisesAlbum(){
         return promisesAlbum.isDisplayed();
     }


}
