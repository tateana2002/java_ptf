package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.appmanager.AplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by vovka on 01.08.2016.
 */
public class TestBase{
  protected static final AplicationManager app = new AplicationManager(BrowserType.FIREFOX);
 // protected final AplicationManager app = new AplicationManager(BrowserType.CHROME);
//  protected final ApplicationManager app = new ApplicationManager(BrowserType.IE);

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }

}
