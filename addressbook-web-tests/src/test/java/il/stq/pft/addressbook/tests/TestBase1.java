package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.appmanager.ApplicationManager1;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by vovka on 03.08.2016.
 */
public class TestBase1 {

  protected final ApplicationManager1 app = new ApplicationManager1(BrowserType.IE);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }


}
