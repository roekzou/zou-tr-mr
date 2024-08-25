package org.zou;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TRReplaceSpace extends TRSuper {

    @Override
    public  void handle(String input){
        Pattern pattern = Pattern.compile("(.)\\1\\1+"); // 正则表达式，(.)表示任意字符，\\1+表示重复一次或多次
        Matcher matcher = pattern.matcher(input);

        boolean  isMatch=false;

        while (matcher.find()) {
            isMatch=true;
            //System.out.println("Found consecutive characters: " + matcher.group());

            input = input.replace(matcher.group(), "");
           // System.out.println(input);

            System.out.println(String.format("->%s ",input));



        }
        if(isMatch)
            handle(input);
    }
}
