package il.stq.pft.addressbook.appmanager;

import il.stq.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
 private WebDriver wd;

  public ContactHelper(WebDriver wd) {
    super(wd)  ;

  }

  public void goToLoginForm() {
    click(By.id("LoginForm"));
  }

  public void launchHomePage() {
      click(By.linkText("home"));
  }

  public void returnAddForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillAddForm(ContactData addForm) {
    type(By.name("firstname"), addForm.getName());
    type(By.name("lastname"), addForm.getLastname());
    type(By.name("address"), addForm.getAddress());
    type(By.name("mobile"), addForm.getTelefon());
    type(By.name("email"), addForm.getEmailaddress());
  }

  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void deleteContactForm() {
    click(By.name("selected[]"));
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
   }

  public void selectContact() {
    click(By.name("selected[]"));

  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));

  }
}
