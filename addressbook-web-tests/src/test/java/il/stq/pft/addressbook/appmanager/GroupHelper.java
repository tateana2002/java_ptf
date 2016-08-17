package il.stq.pft.addressbook.appmanager;

import il.stq.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 02.08.2016.
 */
public class GroupHelper extends HelperBase {
  public GroupHelper(WebDriver wd) {
    super(wd);
  }


  public void returnToGoPage() {
    click(By.linkText("group page"));

  }

  public void submitFormGreation(By submit) {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));

  }

  public void selectGroup() {
    click(By.name("selected[]"));

  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitFormGreation(By.name("submit"));
    returnToGoPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
