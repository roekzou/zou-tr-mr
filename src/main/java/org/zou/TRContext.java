package org.zou;

public class TRContext {
    private TRSuper trSuper;
    public TRContext(String type) {
        if ("space".equals(type))
            trSuper = new TRReplaceSpace();
        else if ("map".equals(type))
            trSuper = new TRReplaceMap();


    }
    public void getResult(String input)
    {
        trSuper.handle(input);
    }


}
