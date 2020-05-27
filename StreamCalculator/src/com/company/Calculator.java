package com.company;

public class Calculator {

    public StringBuilder sb;

    String st;
    private int j = 0;
    int res = 0;

    public Calculator(StringBuilder s){
        sb = new StringBuilder(s);
        st = new String();
        if((sb.charAt(sb.length()-1) == '+') || (sb.charAt(sb.length()-1) == '-')){
            sb.deleteCharAt(sb.length() - 1);
        }
    }


    public String NumAfter(StringBuilder str){
        String arab = "0123456789";
        String aft_a = "";
        while((j < str.length()) && (arab.contains(String.valueOf(str.charAt(j))))){
            aft_a += str.charAt(j);
            j++;
        }
        if(aft_a.length() == 0){

            return "0";
        }else {
            return aft_a;
        }
    }


    public void AllCal(){
        String a = new String();
        char z;

        res = Integer.valueOf(NumAfter(sb));
        while(j < sb.length()){
            z = sb.charAt(j);
            j++;
            a = NumAfter(sb);
            Cal(z, Integer.valueOf(a));

        }
    }
    public void Cal(char s, int a) {
        int result;
        switch (s) {
            case '+':
                res += a;

                break;
            case '-':
                res -= a;
                break;
            default:
                result = 0;
        }
    }
}
