package step_definition;

import DriverInstance.driverInstance;
import Pages.albumPage;
import Pages.landingPage;
import Pages.lastPlayedSongsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class capitalFM extends driverInstance {
    landingPage lp = new landingPage(driver);
    lastPlayedSongsPage lps = new lastPlayedSongsPage(driver);
    albumPage ap = new albumPage(driver);

    @Given("^I am on the capitalfm landing page$")
    public void i_am_on_the_capitalfm_landing_page() throws Throwable {
        lp.selectCookie();

    }

    @When("^I click on the Last Played Songs$")
    public void i_click_on_the_Last_Played_Songs() throws Throwable {
        lp.selectButton();

    }

    @When("^I select any Calvin Harris song$")
    public void i_select_any_Calvin_Harris_song() throws Throwable {
        lps.assertPage();
        lps.selectPromises();
    }

    @Then("^the album page should be displayed$")
    public void the_album_page_should_be_displayed() throws Throwable {
      ap.assertpromisesAlbum();
    }
}

