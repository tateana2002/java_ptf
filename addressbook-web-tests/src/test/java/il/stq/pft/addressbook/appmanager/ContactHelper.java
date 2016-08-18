package il.stq.pft.addressbook.appmanager;

import il.stq.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);

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

  public void fillAddForm(ContactData addForm,boolean creation) {
    type(By.name("firstname"), addForm.getName());
    type(By.name("lastname"), addForm.getLastname());
    type(By.name("address"), addForm.getAddress());
    type(By.name("mobile"), addForm.getTelefon());
    type(By.name("email"), addForm.getEmailaddress());

    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(addForm.getGroup());
    }else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
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

  public void createContact(ContactData addForm, boolean creation) {
    launchHomePage();
     fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru","test1"),true);
  //  fillAddForm(addForm , creation);
    returnAddForm();
    launchHomePage();

  }

  public boolean isThereContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();

  }
}
