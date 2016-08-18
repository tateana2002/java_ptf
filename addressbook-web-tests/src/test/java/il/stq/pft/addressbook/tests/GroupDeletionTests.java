package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
//Удаление групп
    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1",null, null));
        }
        app.getGroupHelper().selectGroup(before -1);
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGoPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after , before -1);

    }


}
