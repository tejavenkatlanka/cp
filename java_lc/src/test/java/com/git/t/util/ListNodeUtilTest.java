package com.git.t.util;

import com.git.t.common.ListNode;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListNodeUtilTest {

  @Test
  void of() {
    Assertions.assertEquals(1, ListNodeUtil.of(List.of(1, 2, 3, 4, 5, 5, 4)).val);
    List<Integer> integers = IntStream.range(1, 12).boxed().collect(Collectors.toList());
    ListNode node = ListNodeUtil.of(integers);

    for (Iterator var3 = integers.iterator(); var3.hasNext(); node = node.next) {
      Integer integer = (Integer) var3.next();
      Assertions.assertEquals(integer, node.val);
    }

  }

  @Test
  void orderMatch() {
    List<Integer> integers = IntStream.range(1, 12).boxed().collect(Collectors.toList());
    ListNode node = ListNodeUtil.of(integers);
    Assertions.assertTrue(ListNodeUtil.orderMatch(integers, node));
  }
}