package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 02.08.2016.
 */
public class NavigationHelper {
private  FirefoxDriver wd;

public NavigationHelper(FirefoxDriver wd){
  this.wd =wd;
}

  public void goToGroupPage() {
     wd.findElement(By.linkText("groups")).click();
  }
}
