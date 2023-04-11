package JavaR2.Adapter;


import java.util.ArrayList;
import java.util.List;

// int 71112233 in
// method getNum 38
// String +38(007)111-22-33 out
public class Test {
    public static void main(String[] args) {


        List<String> listNumber = intToString(phone());
        List<String> listCode = intToString(getNum());
        while (listNumber.size() < 10) {
            listNumber.add(0, "0");
        }
        listNumber.add(0, "+");
        listNumber.add(1, "(");
        listNumber.add(5, ")");
        listNumber.add(9, "-");
        listNumber.add(12, "-");
        listNumber.addAll(1, listCode);


        String strB = "";
        for (String str :
                listNumber) {
            strB += str;
        }
        System.out.println(strB);

        //public String getPhoneNumber() {
        //            String sb;
        //            sb = String.format("%010d", data.getPhoneNumber());
        //            StringBuilder sbFinal = new StringBuilder(sb);
        //            sbFinal.insert(0, "(");
        //            sbFinal.insert(4, ")");
        //            sbFinal.insert(8, "-");
        //            sbFinal.insert(11, "-");
        //            String sbSuperFinal = "+" + data.getCountryPhoneCode() + sbFinal;
        //            return sbSuperFinal;
        //        }
    }

    public static int getNum() {
        return 38;
    }

    public static int phone() {
        return 501112233;
    }

    public static List<String> intToString(int num) {
        String strNum = String.valueOf(num);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strNum.length(); i++) {
            String charNum = String.valueOf(strNum.charAt(i));
            list.add(charNum);
        }
        return list;
    }
}
