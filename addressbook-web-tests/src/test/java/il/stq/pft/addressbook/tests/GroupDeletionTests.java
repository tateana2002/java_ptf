package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {
//Удаление групп
    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();

        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1",null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGoPage();
        List<GroupData>after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() -1);

    }


}
