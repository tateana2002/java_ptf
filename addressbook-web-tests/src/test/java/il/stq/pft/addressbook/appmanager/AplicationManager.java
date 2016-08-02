package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vovka on 02.08.2016.
 */
public class AplicationManager {
  FirefoxDriver wd;
  private SessionHelper sessionHelper;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;



  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);

    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }


  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
