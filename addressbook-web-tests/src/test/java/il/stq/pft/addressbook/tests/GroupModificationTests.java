package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase{
  @Test

  public void testGroupModification(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "test2w", "test3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGoPage();

  }




}
