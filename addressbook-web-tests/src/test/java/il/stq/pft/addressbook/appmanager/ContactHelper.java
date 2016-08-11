package il.stq.pft.addressbook.appmanager;

import il.stq.pft.addressbook.model.AddForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 03.08.2016.
 */
public class ContactHelper {
 private WebDriver wd;

  public ContactHelper(WebDriver wd) {
    this.wd = wd ;

  }

  public void goToLoginForm() {
      wd.findElement(By.id("LoginForm")).click();
  }

  public void launchHomePage() {
      wd.findElement(By.linkText("home")).click();
  }

  public void returnAddForm() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillAddForm(AddForm addForm) {
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

  public void returnToHomePage() {
     wd.findElement(By.linkText("home")).click();
   }

  public void deleteContactForm() {
     wd.findElement(By.name("selected[]")).click();
     wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
     wd.switchTo().alert().accept();
   }

  public void selectContact() {
    wd.findElement(By.name("selected[]")).click();

  }

  public void initContactModification() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void submitContactModification() {
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();

  }
}
