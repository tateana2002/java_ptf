package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vovka on 03.08.2016.
 */
public class ApplicationManager1 {
  FirefoxDriver wd;
  private SessionHelper1 sessionHelper1;

  private  NavigationHelper1 navigationHelper1;
  public ContactHelper contactHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    contactHelper = new ContactHelper(wd);
    navigationHelper1 = new NavigationHelper1(wd);
    sessionHelper1 = new SessionHelper1(wd);
    contactHelper.goToLoginForm();
    sessionHelper1.login("admin", "secret");
  }



  public void stop() {
   wd.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper1 getNavigationHelper1() {
    return navigationHelper1;
  }
}
