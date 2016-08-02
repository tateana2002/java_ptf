package il.stq.pft.addressbook;

import org.testng.annotations.Test;

public class AddNewContact1 extends TestBase1 {

  @Test
  public void testAddNewContact1() {

    goToFormPage();
    fillAddForm(new AddForm("Tatyana", "Lafyorov", "Israel", "0544734644", "uona2002@yandex.ru"));
    returnAddForm();
    launchHomePage();
  }

}
