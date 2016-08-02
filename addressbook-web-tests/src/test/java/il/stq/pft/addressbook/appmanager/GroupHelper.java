package il.stq.pft.addressbook.appmanager;

import il.stq.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vovka on 02.08.2016.
 */
public class GroupHelper extends HelperBase {
  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }


  public void returnToGoPage() {
    click(By.linkText("group page"));

  }

  public void submitFormGreation(By submit) {
    click(By.name("submit"));}

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupGriation() {
    click(By.name("new"));

  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));

  }

  public void selectGroup() {
    click(By.name("selected"));

  }
}