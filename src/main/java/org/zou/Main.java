package org.zou;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "aabccccbbad";
        //
        new TRContext("space").getResult(input);

        input = "abcccbad";
        new TRContext("map").getResult(input);
    }
}