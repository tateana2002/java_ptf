package il.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vovka on 25.07.2016.
 */
public class PointTests {
@Test
public void testDistance (){

  Point p1=new Point(5,8);
  Point p2=new Point(9,4);
//assert p1.distance(p2)==5.656854249492381;
 Assert.assertEquals(p1.distance(p2),5.656854249492381);
}
}
