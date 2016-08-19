package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import il.stq.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by vovka on 03.08.2016.
 */
public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification(){
    app.getContactHelper().launchHomePage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereContact()){
         app.getContactHelper().createContact(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru","test1"));
       }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", null), false);
    app.getContactHelper().launchHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before );


  }

  public static class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
      app.getNavigationHelper().goToGroupPage();
      List<GroupData> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      List<GroupData>after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() + 1);
    }

  }
}
