package other_task;

import java.util.ArrayList;

import java.util.List;

//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
public class Task6 {
    public static void main(String[] args) {
        String s = "babaddgtot";
        List<String> list = new ArrayList<>();
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String symbol = String.valueOf(s.charAt(i));
            if (!newS.toString().contains(symbol)) {
                newS.append(symbol);
            } else {
                newS.append(symbol);
                list.add(str(newS.toString()));
                newS = new StringBuilder();
            }
        }
        System.out.println(list);
    }
    public static String str(String arr){
        StringBuilder str= new StringBuilder();
        for (int i = arr.length()-1; i > 0; i--) {
            String n = String.valueOf(arr.charAt(i));
            str.append(n);
            if (String.valueOf(arr.charAt(i-1)).equals(String.valueOf(arr.charAt(arr.length()-1)))){
                str.append(arr.charAt(arr.length() - 1));
                break;
            }
        }
        return str.toString();
    }


}
