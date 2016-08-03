package il.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 03.08.2016.
 */
public class SessionHelper1 {
  private FirefoxDriver wd;

  public SessionHelper1(FirefoxDriver wd) {
    this.wd = wd;
  }
  public void login(String username, String password) {

    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }
}
