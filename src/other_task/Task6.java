package other_task;

import java.util.ArrayList;
import java.util.Collection;
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
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            String symbol = String.valueOf(s.charAt(i));
            if (!newS.contains(symbol)) {
                newS += symbol;
            } else {
                newS += symbol;
                list.add(str(newS));
                newS = "";
            }
        }
        System.out.println(list);
    }
    public static String str(String arr){
        String str="";
        for (int i = arr.length()-1; i > 0; i--) {
            String n = String.valueOf(arr.charAt(i));
            str+=n;
            if (String.valueOf(arr.charAt(i-1)).equals(String.valueOf(arr.charAt(arr.length()-1)))){
                str+=String.valueOf(arr.charAt(arr.length()-1));
                break;
            }
        }
        return str;
    }


}
