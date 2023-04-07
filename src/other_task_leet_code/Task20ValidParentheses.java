package other_task_leet_code;

//Учитывая строку s, содержащую только символы '(', ')', '{', и '}',
// определите, допустима ли входная строка.'['']'
//
//Входная строка действительна, если:
//
//Открытые скобки должны быть закрыты однотипными скобками.
//Открытые скобки должны быть закрыты в правильном порядке.
//Каждой закрывающей скобке соответствует открытая скобка того же типа.
public class Task20ValidParentheses {
    public static void main(String[] args) {
        String s = "{}()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        boolean state = false;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            char nextSymbol = s.charAt(i + 1);
            if ((symbol == '(' && nextSymbol == ')') ||
                    (symbol == '[' && nextSymbol == ']') ||
                    (symbol == '{' && nextSymbol == '}')) {
                state = true;
                i++;
            } else {
                return false;
            }

        }
        return state;
    }
}
