package org.zou;

import org.junit.Test;


public class TRReplaceMapTest {

    @Test
    public void handle() {
        String input = "abcccbad";
        new  TRReplaceMap().handle(input);
    }
}