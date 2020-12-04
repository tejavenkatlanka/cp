package com.github.general.collection;

import com.github.general.common.MutableString;
import com.github.general.common.NonHashcode;
import com.github.general.common.util.SystemUtils;
import java.util.Objects;

public class Sample {

  private void printHashCode(Object obj) {
    System.out.println(
        " :system : " + System.identityHashCode(obj) + " :object: " + obj.hashCode() + " :objects :"
            + Objects.hashCode(obj));
  }

  public void hash() {
    String obje = "test";
    SystemUtils.printMem();
    //system hashcode is same as reference of an object
    printHashCode(obje);
    String obj1 = "test";
    printHashCode(obj1);

    printHashCode(obj1);

    obj1 = obj1.intern();
    printHashCode(obj1);
    printHashCode(obj1);

    MutableString muString = new MutableString();
    muString.value = "teas";
    printHashCode(muString);
    printHashCode(muString);
    muString.value = "other";

    printHashCode(muString);
    printHashCode(muString);

    int i = 132;
    printHashCode(i);
    printHashCode(i);

    i = 122;
    printHashCode(i);
    printHashCode(i);

    i = 133;
    printHashCode(i);
    Integer In = i;
    printHashCode(In);
    printHashCode(In);
    NonHashcode nh = new NonHashcode();
    printHashCode(nh);
    printHashCode(nh);
       /* WeakReference;
        SoftReference;
        PhantomReference;*/
       /* IdentityHashMap;
        HashMap;*/
  }
}
