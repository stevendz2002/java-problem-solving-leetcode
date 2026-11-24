package com.steven.algorithms.math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {


        String n = String.valueOf(x);
        char [] arreglo = new char[n.length()];

        int j = 0;
        for (int i= n.length()-1 ; i >= 0 ; i--,j++){
            arreglo [i]= n.charAt(j);

        }

       return  n.equals(new String(arreglo));
    }
}
