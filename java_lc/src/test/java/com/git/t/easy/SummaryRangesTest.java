package com.git.t.easy;

import com.git.t.easy.number.SummaryRanges;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SummaryRangesTest {

    @Test
    void summaryRanges() {
        SummaryRanges range = new SummaryRanges();
        List<String> list = range.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        assertArrayEquals(new String[]{"0->2", "4->5", "7"}, list.
                toArray(new String[list.size()]));
        list = range.summaryRanges(new int[]{0,2,3,4,6,8,9});
        assertArrayEquals(new String[]{"0","2->4","6","8->9"}, list.
                toArray(new String[list.size()]));

        list = range.summaryRanges(new int[]{});
        assertArrayEquals(new String[]{}, list.
                toArray(new String[list.size()]));

        list = range.summaryRanges(new int[]{ -1});
        assertArrayEquals(new String[]{"-1"}, list.
                toArray(new String[list.size()]));

    }
}