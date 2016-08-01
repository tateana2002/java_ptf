package il.stq.pft.addressbook;

import org.testng.annotations.Test;

public class GroupGreationTest extends TestBase {

  @Test
  public void testGroupGreation() {

    initGroupGriation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitFormGreation();
    returnToGoPage();
  }

}
