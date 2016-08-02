package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupGreationTest extends TestBase {

  @Test
  public void testGroupGreation() {

    app.getGroupHelper().initGroupGriation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitFormGreation(By.name("submit"));
    app.getGroupHelper().returnToGoPage();
  }

}
