package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 02.08.2016.
 */
public class NavigationHelper extends HelperBase {


public NavigationHelper(WebDriver wd){
  super(wd);

}

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
