package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.ListofCandidatesPage;
import edu.bsuir.web.page.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CandidateEditTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();
    private ListofCandidatesPage lcp = new ListofCandidatesPage();

    @Before
    public void init() throws InterruptedException {
        driver = WebDriverSingleton.getInstance();
        super.loginUser("HR");
    }

    @Test
    public void createCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

       // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void createSameCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void createCandidateNotFillAllField () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void addPhoto () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void addPhotobyClickPhoto () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void loadSV () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickPhoto () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void addComment () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void deleteComment () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void editComment () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickEditCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void deleteCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void ExportCantitdateSVtoPDF () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkGoToBack () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkEditCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkclickPhoto () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickAttachFile () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkGoTabs () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
