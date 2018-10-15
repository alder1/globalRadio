package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static Pages.pageClick.legacyInteractWithFileDialogue;

public class albumPage {
    WebDriver driver;

    public albumPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='ember205']/section[1]/div/div[2]/div[1]/div[2]/header/h1/span[1]")
    private WebElement promisesAlbum;



     public boolean assertpromisesAlbum() throws Exception {
         JavascriptExecutor jsx = (JavascriptExecutor)driver;
         jsx.executeScript("window.confirm('Alert dismiss in 5 sec');");

         try {
             Alert confirmation = driver.switchTo().alert();
             String alertText =confirmation.getText();
             System.out.println("Alert text is :" +alertText);
             Thread.sleep(5000);
             confirmation.dismiss();
         }catch (Exception e){
             System.out.println(e);
         }


         return promisesAlbum.isDisplayed();


     }


}
