package il.stqa.ptf.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vovka on 18.08.2016.
 */
public class Collections {
  public static void main (String args[]){
    String[] langs = {"Java","C#","Python","PHP"};
    List<String>  languages = Arrays.asList("Java","C#","Python","PHP");

    for (String l : languages){

    System.out.println("я хочу выучить " +l);

  }
}
}