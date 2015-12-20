package com.whujl.string;

/**
 * Created by whujl on 15/12/20.
 */
public class AddBinary {

    public String addbinary(String a, String b){
        if(a == null || a.length() == 0){
            return b;
        }

        if(b == null || b.length() == 0){
            return a;
        }

        int m = a.length();
        int n = b.length();
        int carry = 0;

        int maxLength = Math.max(m, n);

        String result = "";

        for(int i = 0 ; i < maxLength; i++){
            int p=0,q=0;
            if(i<m) {
                p = a.charAt(m - 1 - i) - '0';
            } else {
                p = 0;
            }

            if(i<n) {
                q = b.charAt(n - 1 - i) - '0';
            } else {
                q = 0;
            }

            int tmp = p + q + carry;
            carry = tmp / 2;
            result = tmp % 2 + result;

        }

        return carry == 0 ?result:"1"+result;
    }

    public static void main(String[] args) {
        String a = "101011";
        String b = "010101";

        System.out.println(new AddBinary().addbinary(a, b ));
    }
}
