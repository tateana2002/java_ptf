package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 03.08.2016.
 */
public class NavigationHelper1 {
 private FirefoxDriver wd;

  public NavigationHelper1(FirefoxDriver wd) {
    this.wd=wd;
  }

  public void goToFormPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
