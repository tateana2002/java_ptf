package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by vovka on 03.08.2016.
 */
public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification(){
    app.getContactHelper().launchHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddForm(new ContactData("Tatyana", "Lafyorov", "Russia", "0544734644", "uona2002@yandex.ru"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().launchHomePage();


  }
}
