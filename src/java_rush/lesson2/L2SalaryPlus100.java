package java_rush.lesson2;

public class L2SalaryPlus100 {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        System.out.println("Твоя зарплата составляет: " + (salary+100) + " долларов в месяц.");
    }
}

