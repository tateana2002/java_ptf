package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by vovka on 03.08.2016.
 */
public class ContactModificationTests extends TestBase {
  private int index;

  @Test(enabled = false)

  public void testContactModification(){
    app.getContactHelper().launchHomePage();

    if (! app.getContactHelper().isThereContact()){
         app.getContactHelper().createContact(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru","test1"));
       }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(index);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", null), false);
    app.getContactHelper().launchHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());


  }
}
