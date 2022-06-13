package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.WebPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ActionClassSteps {
    WebPage webPage=new WebPage();

    @Given("Imdb Siteye gidilir")
    public void imdb_siteye_gidilir() {
        BrowserUtilities.waitForPageToLoad(10);
        Driver.getDriver().get("https://www.imdb.com/");
    }
    @When("Arama çubugunun sol tarafinda bulunan Menu butonuna basilir")
    public void arama_çubugunun_sol_tarafinda_bulunan_menu_butonuna_basilir() {
        webPage.menuButtonClick();
    }
    @When("Gelen ekranda Award & Events basligi altinda bulunan Oscars butonuna tiklanir")
    public void gelen_ekranda_award_events_basligi_altinda_bulunan_oscars_butonuna_tiklanir() {
        webPage.secondClick();
    }
    @And("Event History basligi altinda {string} degeri secilir")
    public void eventHistoryBasligiAltindaDegeriSecilir(String arg0) {
        webPage.date();
    }
    @When("Honorary Award başligi altinda The Jazz Singer secilir")
    public void honorary_award_başligi_altinda_the_jazz_singer_secilir() {
        webPage.menuButtonClick();

    }


}
