package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.appmanager.AplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by vovka on 01.08.2016.
 */
public class TestBase{

  protected final AplicationManager app = new AplicationManager(BrowserType.CHROME);


  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
