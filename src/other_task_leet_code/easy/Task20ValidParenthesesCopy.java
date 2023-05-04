package other_task_leet_code.easy;

import java.util.Stack;

//Учитывая строку s, содержащую только символы '(', ')', '{', и '}',
// определите, допустима ли входная строка.'['']'
//
//Входная строка действительна, если:
//
//Открытые скобки должны быть закрыты однотипными скобками.
//Открытые скобки должны быть закрыты в правильном порядке.
//Каждой закрывающей скобке соответствует открытая скобка того же типа.
public class Task20ValidParenthesesCopy {
    public static void main(String[] args) {
        String s = "{}([))";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // convert string into char array and access the characters using for each loop.
        for(char ch: s.toCharArray())
        {
            // check ch
            switch (ch)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        return stack.isEmpty();

    }
}
