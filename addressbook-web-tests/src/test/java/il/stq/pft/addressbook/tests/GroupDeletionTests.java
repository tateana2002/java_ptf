package il.stq.pft.addressbook.tests;

import il.stq.pft.addressbook.model.GroupData;
import il.stq.pft.addressbook.model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.regex.Matcher;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupDeletionTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.group().all().size()==0){
            app.group().create(new GroupData().withName("test1"));
        }
    }
//Удаление групп
    @Test
    public void testGroupDeletion() {
        Groups before = app.group().all();
        GroupData deletedGroup =before.iterator().next();
        app.group().delete(deletedGroup);
        Groups after = app.group().all();
        assertEquals(after.size(),before.size()-1);
        assertThat(after, equalTo(before.withhout(deletedGroup)));

        }


}



