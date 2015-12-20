package com.whujl.string;

/**
 * Created by whujl on 15/11/29.
 */
public class StringToInteger {

    public int atoi(String str){

        if(str == null){
            return 0;
        }

        str = str.trim();

        if(str.length() == 0){
            return 0;
        }




        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().atoi("123"));
    }


}
