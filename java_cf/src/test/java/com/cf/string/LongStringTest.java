package com.cf.string;

import java.util.Map;
import org.junit.jupiter.api.Assertions;

class LongStringTest {

  @org.junit.jupiter.api.Test
  void makeItShort() {
    LongString string = new LongString();
    Map<String, String> map = Map.of("word", "word",
        "localization", "l10n",
        "internationalization", "i18n",
        "pneumonoultramicroscopicsilicovolcanoconiosis", "p43s");
    for (String s : map.keySet()) {
      //  System.out.println(string.makeItShort(s));
      Assertions.assertEquals(map.get(s), string.makeItShort(s));
    }
  }
}