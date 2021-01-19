package com.concirrus.palindrome;

public class Palindrome {

/*
 * Method will read the string and replace '?' with character and verify the final string is Palindrome or not.
 *
 * To execute, please run the main method.
 * */

    public static String replacedString(String inputString){
        char[] strArray = inputString.toCharArray();
        int charArrayLength = strArray.length-1;
        if(charArrayLength <=1000){
            for(int i=0;i< charArrayLength;i++){
                if(strArray[0] == '?'){
                    strArray[0] = strArray[i+1];
                }
                else if(strArray[charArrayLength-1] == '?'){
                    strArray[charArrayLength-1]= strArray[charArrayLength];
                }
                else if(strArray[charArrayLength] == '?'){
                    strArray[charArrayLength] = strArray[charArrayLength-1];
                }
                else{
                    if(strArray[i] == '?'){
                        strArray[i]=strArray[i-1];
                    }
                }
            }
        }
        return String.valueOf(strArray);
    }
    public static void findPalindrome(String inputStringWithQuestionMark){
        boolean isPalindrome=false;
        String inputString = replacedString(inputStringWithQuestionMark);
        String reverse = new StringBuilder(inputString).reverse().toString();
        if(inputString.equals(reverse)){
            System.out.println(inputString+" is Palindrome ");

        }else{
            System.out.println(inputString+" is not Palindrome ");
        }


    }

}
