package il.stq.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase1 {


  @Test
  public void testDeleteContact() {
    launchHomePage();
    deleteContactForm();
    returnToHomePage();
  }


}
