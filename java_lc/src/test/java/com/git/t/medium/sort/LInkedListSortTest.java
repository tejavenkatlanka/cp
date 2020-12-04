package com.git.t.medium.sort;

import com.git.t.common.ListNode;
import com.git.t.util.ListNodeUtil;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LInkedListSortTest {

  @Test
  void sortList() {
    LInkedListSort lInkedListSort = new LInkedListSort();
    List<Integer> integerList = IntStream.range(1, 20).boxed().collect(Collectors.toList());
    System.out.println(integerList);
    System.out.println("shuffling");
    Collections.shuffle(integerList);
    System.out.println((integerList));
    ListNode head = ListNodeUtil.of(integerList);
    ListNode sort = lInkedListSort.sortList(head);
    Collections.sort(integerList);
    Assertions.assertTrue(ListNodeUtil.orderMatch(integerList, sort));
  }
}