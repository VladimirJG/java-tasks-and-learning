package test_epam;

import java.util.Stack;

class MyStringBuilderMemento {
    private String state;

    public MyStringBuilderMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class MyStringBuilder {
    private StringBuilder stringBuilder;

    public MyStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void append(String string) {
        stringBuilder.append(string);
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
    }

    public int length() {
        return stringBuilder.length();
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public MyStringBuilderMemento save() {
        return new MyStringBuilderMemento(stringBuilder.toString());
    }

    public void restore(MyStringBuilderMemento memento) {
        stringBuilder = new StringBuilder(memento.getState());
    }
}

class  Memory {
    private Stack<MyStringBuilderMemento> history;
    private MyStringBuilder myStringBuilder;

    public Memory(MyStringBuilder myStringBuilder) {
        this.myStringBuilder = myStringBuilder;
        history = new Stack<>();
    }

    public void backup() {
        history.push(myStringBuilder.save());
    }

    public void undo() {
        if (!history.isEmpty()) {
            myStringBuilder.restore(history.pop());
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder(new StringBuilder());
        Memory memory = new Memory(sb);

        sb.append("Hello");
        System.out.println(sb);
        sb.append(" ");
        sb.append("Memento");
        System.out.println(sb);
        System.out.println("----Сохранение состояния--------------");

        memory.backup();

        sb.delete(0,6);

        System.out.println(sb);

        System.out.println("----Восстановление состояния из памяти-");

        memory.undo();
        System.out.println(sb);

    }
}
