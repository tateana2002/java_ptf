package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase{
  @Test

  public void testGroupModification(){
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGoPage();

  }




}
