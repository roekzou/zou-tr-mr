package org.zou;

import org.junit.Test;

public class TRReplaceSpaceTest {

    @Test
    public void handle() {
        String input = "aabccccbbad";
        new TRReplaceSpace().handle(input);
    }
}