package com.tngp.bignumber;

public class bignumber {
    public static void main(String[] args) {
        String firstNumber = "990";
        String secondNumber = "90";

        String first[] = firstNumber.split("", 0);
        String second[] = secondNumber.split("", 0);

        Integer[] firstint=new Integer[first.length];
        Integer[] secondint=new Integer[second.length];
        int i=0;
        for (String str : first)
            firstint[i++] = Integer.parseInt(str);

        i=0;
        for (String str : second)
            secondint[i++] = Integer.parseInt(str);

        String sum="";
        int over = 0, plus = 0;
        int j = firstint.length-1;
        int k = secondint.length-1;
        for(; j>=0 && k>=0;){
            plus = 0;
            plus = (firstint[j]+secondint[k]+over)%10;
            over = (firstint[j]+secondint[k]+over)/10;
            sum = plus + sum;
            over = 0;
            j--; k--;
        }
        System.out.println(sum);

    }
}
