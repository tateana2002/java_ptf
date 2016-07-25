package il.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vovka on 24.07.2016.
 */
public class SquareTests {
  @Test
  public void testArea(){
    Square s = new Square (5);
  //assert s.area()==25;
    Assert.assertEquals(s.area(),25.0);


  }
}
