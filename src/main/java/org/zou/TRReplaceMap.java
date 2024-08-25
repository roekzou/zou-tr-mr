package org.zou;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TRReplaceMap extends TRSuper{
    private Map<String,String> map;

    public TRReplaceMap() {

        Map<String,String> map = new HashMap<>();
        map.put("ccc","b");
        map.put("bbb","a");
        this.map=map;
    }
    @Override
    public  void handle(String input){
        Pattern pattern = Pattern.compile("(.)\\1\\1+"); // 正则表达式，(.)表示任意字符，\\1+表示重复一次或多次
        Matcher matcher = pattern.matcher(input);

        AtomicBoolean isMatch= new AtomicBoolean(false);

        while (matcher.find()) {

            //System.out.println("Found consecutive characters: " + matcher.group());

            AtomicReference<String> values= new AtomicReference<>("");
            map.forEach((header,item)->{

                if(matcher.group().equals(header))
                {
                    isMatch.set(true);
                    values.set(item);

                }

            });
            if(isMatch.get()) {
                input = input.replace(matcher.group(), values.get());
                System.out.println(String.format("->%s %s is replaced by %s ", input, matcher.group(), values.get()));
            }


        }
        if(isMatch.get())
            handle(input);
    }

}
