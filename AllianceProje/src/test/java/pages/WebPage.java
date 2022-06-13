package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

public class WebPage extends AbstractBasePage {


    @FindBy(xpath = "//div[contains(text(),'Menu')]")
    protected WebElement menuButonu;

    @FindBy(xpath = "//span[contains(text(),'Oscars')]")
    protected WebElement ikinciTiklama;

    @FindBy(xpath = "//div[@class='event-history-widget__years']/div[16]/span[4]")
    protected WebElement tarihSecimi;

    @FindBy(xpath = "//body[@id='styleguide-v2']/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@class='pagecontent']/div[@id='content-2-wide']/div[@id='main']/div[@class='article']/span[@class='ab_widget']/div[@id='center-3-react']/div[@class='nominees-widget']/div[@class='event-widgets__award-list']/div[@class='event-widgets__award']/h3[@class='event-widgets__award-categories']/div[@class='event-widgets__award-category']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/span[1]/a[1]")
    protected WebElement filmSecim;

    public void menuButtonClick(){
        BrowserUtilities.wait(5);
        menuButonu.click();
    }
    public void secondClick(){
        BrowserUtilities.waitForPageToLoad(6);
        ikinciTiklama.click();
    }
    public void date(){
        BrowserUtilities.wait(5);
        tarihSecimi.click();
        BrowserUtilities.wait(3);
    }
    public void MovieSearchClick(){
        BrowserUtilities.waitForPageToLoad(5);
        jsExecutor("window.scrollBy(0,3750)");
        filmSecim.click();

    }

}
