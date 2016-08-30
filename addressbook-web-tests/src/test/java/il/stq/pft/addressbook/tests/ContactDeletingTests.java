package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletingTests extends TestBase {
//удаление контактов

  @Test(enabled = false)
  public void testsContactDeleting() {

    app.getContactHelper().launchHomePage();

    if (!app.getContactHelper().isThereContact())
      app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", "test1"), true);
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().deleteContactForm();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() -1);

    before.remove(before.size()-1);
    Assert.assertEquals(before,after);
  }
  }


