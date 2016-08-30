package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test(enabled = false)
  public void testsContactCreation() {

    app.goTo().goToFormPage();
    app.getContactHelper().launchHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
   // if (!app.getContactHelper().isThereContact()) {
      app.getContactHelper().createContact(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", "test1"));
   // }
   // app.getContactHelper().selectContact();
   // app.getContactHelper().initContactModification();
   // app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", null), false);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() +1);
  }
}
