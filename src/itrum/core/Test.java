package itrum.core;


import java.util.Stack;

class MyStringBuilder {
    private StringBuilder stringBuilder;

    public MyStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void append(String string) {
        stringBuilder.append(string);
    }

    public int length() {
        return stringBuilder.length();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
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

class MyStringBuilderMemento {
    private String state;

    public MyStringBuilderMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Memory {
    private Stack<MyStringBuilderMemento> history;
    private MyStringBuilder myStringBuilder;

    public Memory(MyStringBuilder myStringBuilder) {
        this.myStringBuilder = myStringBuilder;
        this.history = new Stack<>();
    }

    public void backup() {
        history.push(myStringBuilder.save());
    }

    public void undo() {
        if (history.isEmpty()) {
            return;
        }
        myStringBuilder.restore(history.pop());
    }
}

public class Test {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder(new StringBuilder());
        Memory memory = new Memory(myStringBuilder);

        myStringBuilder.append("Hello");
        myStringBuilder.append(" ");
        myStringBuilder.append("Memento");
        System.out.println(myStringBuilder);

        System.out.println("---Сохранение состояния---");

        memory.backup();

        System.out.println("---Изменение состояния---");

        myStringBuilder.delete(0,6);
        System.out.println(myStringBuilder);

        System.out.println("---Возврат состояния---");
        memory.undo();

        System.out.println(myStringBuilder);
    }
}
