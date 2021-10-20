package com.git.t.easy.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin {

  String append = "ma";
  String thirdC = null;
  Set<Character> vowels = new HashSet<>(
      Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

  public GoatLatin() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 150; i++) {
      builder.append('a');
    }
    thirdC=builder.toString();

  }

  public String toGoatLatin(String sentence) {

    StringBuilder builder = new StringBuilder();
    int i = 0 , count=0;
    while (i < sentence.length()) {

      int j = i;
      while (j < sentence.length() && sentence.charAt(j) != ' ') {
        j++;
      }
      count++;
      if (vowels.contains(sentence.charAt(i))){
          builder.append(sentence.substring(i,j)) ;
      }
      else {
        builder.append(sentence.substring(i+1,j)).append(sentence.charAt(i)) ;

      }
      builder.append(append);
      builder.append(thirdC.substring(0,count));
      if(sentence.charAt(j)==' '){
        builder.append(sentence.charAt(j++));
      }
      i=j;

    }

    return builder.toString();
  }

}
