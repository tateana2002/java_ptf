package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.group().list().size()==0){
            app.group().create(new GroupData().withName("test1"));
        }
    }
//Удаление групп
    @Test
    public void testGroupDeletion() {
        List<GroupData> before = app.group().list();
        int index = before.size() -1;
        app.group().delete(index);
        List<GroupData>after = app.group().list();
        Assert.assertEquals(after.size(), index);

        before.remove(index);
            Assert.assertEquals(before,after);
        }


}



