package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.linkText;

/**
 * Created by vovka on 02.08.2016.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
    super(wd);

  }

  public void goToGroupPage() {//проверка страницы
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
              return;
}
  click(linkText("groups"));
    }


  public void goToFormPage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    wd.findElement(linkText("add new")).click();
  }
}
