package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().createGroup(new GroupData("test1",null, null));

  }

}
