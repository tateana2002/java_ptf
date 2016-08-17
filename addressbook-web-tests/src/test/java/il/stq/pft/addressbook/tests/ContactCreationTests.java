package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testsContactCreation() {

    app.getNavigationHelper().goToFormPage();
    app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru","test1"),true);
    app.getContactHelper().returnAddForm();
    app.getContactHelper().launchHomePage();
  }

}
