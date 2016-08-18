package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletingTests extends TestBase {
//удаление контактов

  @Test
  public void testsContactDeleting() {
    app.getContactHelper().launchHomePage();
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereContact())
      app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru", "test1"), true);
    app.getContactHelper().deleteContactForm();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }


}
