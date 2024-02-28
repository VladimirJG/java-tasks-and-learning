package itrum.another;


import java.util.Stack;

interface IMemento {
    int getDollars();

    int getEuro();
}

class ExchangeMemento implements IMemento {
    private int dollars;
    private int euro;

    public ExchangeMemento(int dollars, int euro) {
        this.dollars = dollars;
        this.euro = euro;
    }

    @Override
    public int getDollars() {
        return dollars;
    }

    @Override
    public int getEuro() {
        return euro;
    }
}

class Exchange {
    private int dollars;
    private int euro;

    public Exchange(int dollars, int euro) {
        this.dollars = dollars;
        this.euro = euro;
    }

    public void getDollars() {
        System.out.println("Долларов: " + dollars);
    }

    public void getEuro() {
        System.out.println("Eвро: " + euro);
    }

    public void sell() {
        if (dollars > 0) {
            dollars--;
        }
    }

    public void buy() {
        ++euro;
    }

    public ExchangeMemento save() {
        return new ExchangeMemento(dollars, euro);
    }

    public void restore(IMemento exchangeMemento) {
        dollars = exchangeMemento.getDollars();
        euro = exchangeMemento.getEuro();
    }
}

class Memory {
    private Stack<IMemento> history;
    Exchange exchange;

    public Memory(Exchange exchange) {
        this.exchange = exchange;
        history = new Stack<>();
    }

    public void backup() {
        history.push(exchange.save());
    }

    public void undo() {
        if (history.isEmpty()) return;
        exchange.restore(history.pop());
    }
}

public class Memento {
    public static void main(String[] args) {
        Exchange exchange = new Exchange(10, 10);

        Memory memory = new Memory(exchange);

        exchange.getDollars();
        exchange.getEuro();

        System.out.println("----Продажа доллара, покупка евро-----");
        exchange.sell();
        exchange.buy();

        exchange.getDollars();
        exchange.getEuro();


        System.out.println("----Сохранение состояния--------------");
        memory.backup();


        System.out.println("----Продажа доллара, покупка евро-----");
        exchange.sell();
        exchange.buy();


        exchange.getDollars();
        exchange.getEuro();

        System.out.println("----Восстановление состояния из памяти-");
        memory.undo();

        exchange.getDollars();
        exchange.getEuro();

    }
}



