package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class DNASequencesTest {

  @Test
  void findRepeatedDnaSequences() {

    DNASequences dnaSequences = new DNASequences();
    assertEquals(List.of("AAAAACCCCC", "CCCCCAAAAA"),
        dnaSequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
    );
  }
}