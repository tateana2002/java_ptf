package il.stq.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase1 {
//удаление контактов

  @Test
  public void testDeleteContact() {
    app.getContactHelper().launchHomePage();
    app.getContactHelper().deleteContactForm();
    app.getContactHelper().returnToHomePage();
  }


}
