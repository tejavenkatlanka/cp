package com.git.t.medium;

import com.git.t.common.TreeNode;
import com.git.t.easy.AddString;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathToSumTest {

    @Test
    void pathToSum() {
        PathToSum s=new PathToSum();
        assertEquals(List.of(List.of(5)),s.pathSum(new TreeNode(5),5));
    }
}