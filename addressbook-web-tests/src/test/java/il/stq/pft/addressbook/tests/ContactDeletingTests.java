package il.stq.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTests extends TestBase {
//удаление контактов

  @Test
  public void testsContactDeleting() {
    app.getContactHelper().launchHomePage();
    app.getContactHelper().deleteContactForm();
    app.getContactHelper().returnToHomePage();
  }


}
