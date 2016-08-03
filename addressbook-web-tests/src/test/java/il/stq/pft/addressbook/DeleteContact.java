package il.stq.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase1 {


  @Test
  public void testDeleteContact() {
    app.getContactHelper().launchHomePage();
    app.getContactHelper().deleteContactForm();
    app.getContactHelper().returnToHomePage();
  }


}
