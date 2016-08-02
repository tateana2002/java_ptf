package il.stq.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by vovka on 03.08.2016.
 */
public class TestBase1 {
  FirefoxDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  @BeforeMethod
  public void setUp() throws Exception {
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/");
      goToLoginForm();
      login("admin","secret");
  }

  private void login(String username, String password) {

      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  private void goToLoginForm() {
      wd.findElement(By.id("LoginForm")).click();
  }

  protected void launchHomePage() {
      wd.findElement(By.linkText("home")).click();
  }

  protected void returnAddForm() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  protected void fillAddForm(AddForm addForm) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(addForm.getName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(addForm.getLastname());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(addForm.getAddress());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(addForm.getTelefon());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(addForm.getEmailaddress());
  }

  protected void goToFormPage() {
      wd.findElement(By.linkText("add new")).click();
  }

  @AfterMethod
  public void tearDown() {
      wd.quit();
  }

  protected void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  protected void deleteContactForm() {
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    wd.switchTo().alert().accept();
  }
}
