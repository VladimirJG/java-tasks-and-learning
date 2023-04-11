package JavaR2.Adapter;
//Давай представим ситуацию, что с одной стороны у нас есть некая база данных,
// в которой хранятся данные. База данных имеет стандартный набор команд (методов) для предоставления данных,
// они описаны в интерфейсе IncomeData. Примеры представления данных приведены в комментариях около каждого метода.
// С другой стороны есть пользователи, которые хотят получать данные из этой базы, но в каком-то другом
// (конкретном) формате. Запросы от пользователей представлены методами в интерфейсах Customer и Contact.
// Там же (в комментариях около каждого метода) есть примеры представления информации в том виде,
// в котором пользователи хотят ее получать из базы данных.
//
//Твоя задача: написать логику класса адаптера IncomeDataAdapter, который будет по запросам методов из интерфейсов Customer
// и Contact, обращаться в базу (методы интерфейса IncomeData), получать данные, обрабатывать их,
// при необходимости изменять представление, и возвращать в виде результата.
//
//Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
//UA Ukraine
//RU Russia
//CA Canada
//
//При необходимости дополни начало телефонного номера (без кода страны) нулями до 10 цифр
// (смотри примеры в комментарии к соответствующему методу). Обрати внимание на формат вывода телефона,
// фамилии и имени человека (смотри примеры в комментарии к соответствующему методу).
//
//Требования:
//•	Класс Solution должен содержать public static поле countries типа Map<String, String>.
//•	В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
//•	Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
//•	Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
//•	Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
//•	В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев
// в интерфейсах.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String codeCountry = data.getCountryCode();
            String nameCountry = "";
            for (Map.Entry<String, String> pair :
                    countries.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                if (codeCountry.equals(key)) {
                    nameCountry = value;
                }
            }
            return nameCountry;
            //public String getCountryName() {
            //              return countries.get(data.getCountryCode());
            //        }
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            int a = data.getPhoneNumber();
            int b = data.getCountryPhoneCode();
            String strNum = String.valueOf(a);
            List<String> listNum = new ArrayList<>();
            for (int i = 0; i < strNum.length(); i++) {
                String charNum = String.valueOf(strNum.charAt(i));
                listNum.add(charNum);
            }
            String strCode = String.valueOf(b);
            List<String> listCode = new ArrayList<>();
            for (int i = 0; i < strCode.length(); i++) {
                String charNum = String.valueOf(strNum.charAt(i));
                listCode.add(charNum);
            }
            while (listNum.size() < 10) {
                listNum.add(0, "0");
            }
            listNum.add(0, "+");
            listNum.add(1, "(");
            listNum.add(5, ")");
            listNum.add(9, "-");
            listNum.add(12, "-");
            listNum.addAll(1, listCode);

            String strB = "";
            for (String str :
                    listNum) {
                strB += str;
            }
            return strB;

            ////public String getPhoneNumber() {
            //        //            String sb;
            //        //            sb = String.format("%010d", data.getPhoneNumber());
            //        //            StringBuilder sbFinal = new StringBuilder(sb);
            //        //            sbFinal.insert(0, "(");
            //        //            sbFinal.insert(4, ")");
            //        //            sbFinal.insert(8, "-");
            //        //            sbFinal.insert(11, "-");
            //        //            String sbSuperFinal = "+" + data.getCountryPhoneCode() + sbFinal;
            //        //            return sbSuperFinal;
            //        //        }
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}
