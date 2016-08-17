package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
//Удаление групп
    @Test
    public void testGroupDeletion() {

        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1",null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGoPage();

    }


}
