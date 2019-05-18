package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String inputString = "I speak Goat Latin";
        String inputString = "The quick brown fox jumped over the lazy dog";
        String outputString = toGoatLatin(inputString);
        System.out.println(outputString);
    }

    public static String toGoatLatin(String S) {
        if(S.length()>2) {
            String[] inputArray = S.split(" ");
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < inputArray.length; i++) {
                str1.append(checkForVowelsAndAddMA(inputArray[i]));
                str1.append(" ");
            }
            String convertedString = str1.toString();
            String[] inputArray1 = convertedString.split(" ");
            for (int i = 0; i < inputArray1.length; i++) {
                //System.out.println(inputArray1[i]+" is the word "+i);
                str2.append(checkForConsonantsAndAddMA(inputArray1[i]));
                str2.append(" ");
            }

            String strAfterConversion = str2.toString();
            String[] inputArrayAfterConversion = strAfterConversion.split(" ");
            StringBuilder outputString = new StringBuilder();
            for (int i = 0; i < inputArrayAfterConversion.length; i++) {
                outputString.append(addAsBasedOnIndex(inputArrayAfterConversion[i], i + 1));
                outputString.append(" ");
            }
            return outputString.toString().trim();
        }
        else{
            return S;
        }


    }

    public static String checkForVowelsAndAddMA(String inputWord){
        StringBuilder str1 = new StringBuilder();
        if(inputWord.charAt(0)=='a'||inputWord.charAt(0)=='e'||inputWord.charAt(0)=='i'||inputWord.charAt(0)=='o'||inputWord.charAt(0)=='u'||inputWord.charAt(0)=='A'||inputWord.charAt(0)=='E'||inputWord.charAt(0)=='I'||inputWord.charAt(0)=='O'||inputWord.charAt(0)=='U')
        {
            str1.append(inputWord+"ma");
        }
        else{
            str1.append(inputWord);
        }
        return str1.toString();
    }

    public static String checkForConsonantsAndAddMA(String inputWord){
        StringBuilder str = new StringBuilder();
        if(inputWord.charAt(0)!='a'&&inputWord.charAt(0)!='e'&&inputWord.charAt(0)!='i'&&inputWord.charAt(0)!='o'&&inputWord.charAt(0)!='u'&&inputWord.charAt(0)!='A'&&inputWord.charAt(0)!='E'&&inputWord.charAt(0)!='I'&&inputWord.charAt(0)!='O'&&inputWord.charAt(0)!='U'){
            str.append(inputWord.substring(1));
            str.append(inputWord.charAt(0));
            str.append("ma");
        }
        else{
            str.append(inputWord);
        }
        return str.toString();
    }

    public static String addAsBasedOnIndex(String inputString,int index){
        StringBuilder str = new StringBuilder();
        str.append(inputString);
        for(int i=0;i<index;i++){
            str.append('a');
        }
        return str.toString();
    }

    public static String checkForVowelsAndAddMAString(String[] inputString){
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<inputString.length;i++){
            if(inputString[i].charAt(0)=='a'||inputString[i].charAt(0)=='e'||inputString[i].charAt(0)=='i'||inputString[i].charAt(0)=='o'||inputString[i].charAt(0)=='u')
            {
                str1.append(inputString[i]+"ma");
            }else{
                str1.append(inputString[i]);
                str1.append(" ");
            }
        }
        return str1.toString();
    }


    /**
     * public String toGoatLatin(String S) {
     *         String[] words = S.split(" ");
     *
     *         String result = "";
     *
     *         String curr = "a";
     *
     *         String vowels = "aeiouAEIOU";
     *
     *         for(String word: words) {
     *             if(!vowels.contains(word.charAt(0) + "")) {
     *                 word = word.substring(1) + word.charAt(0);
     *             }
     *
     *             word += "ma";
     *             word += curr;
     *             curr += "a";
     *             result += word + " ";
     *         }
     *
     *         return result.trim();
     *     }
     */
}
