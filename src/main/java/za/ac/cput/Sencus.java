package za.ac.cput;

import java.util.*;

public class Sencus {

    Set<Integer> sen = new HashSet<Integer>();
    Set<Integer> sen1 = new HashSet<Integer>();
    Set<Integer> un = new HashSet<Integer>(sen);
;
    public void houses(){

        sen.addAll(Arrays.asList(new Integer[]{4,2,3,5}));
        sen1.addAll(Arrays.asList(new Integer[]{1,6,3,4}));


        un.addAll(sen1);

    }

}
